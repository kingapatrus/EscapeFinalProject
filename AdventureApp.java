import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.PrintStream;
import java.io.IOException;
import java.io.OutputStream;

public class AdventureApp extends Application
{
    ImageView view;
    TextArea output;
    TextField input;
    String reply;

    World world;

    public void start(Stage stage)
    {
        //Set up the game data
        world = new World();

        //Set up an image container
        view = new ImageView();
        view.setFitHeight(300);
        view.setPreserveRatio(true);

        view.setImage(world.currentRoom.image);
        
        //Set up a text display window
        output = new TextArea();
        output.setWrapText(true);
        output.setEditable(false);
        output.appendText("Adventure!\n");
        //output.setStyle("-fx-opacity: 1.0;");

        //Redirect "System.out.println()" to print to the text display window
        Console console = new Console(output);
        PrintStream ps = new PrintStream(console, true);
        System.setOut(ps);
        System.setErr(ps);

        //Set up a small text entry box
        input = new TextField();

        //Link the method to call every time the user presses Enter
        input.setOnAction(this::textEntered);

        // Create a new window manager and put all components inside
        VBox pane = new VBox();
        pane.getChildren().addAll(view, output, input);

        Scene scene = new Scene(pane, 400,500);
        stage.setTitle("Adventure");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();        
    
        world.currentRoom.readScript("");
    }

    private void textEntered(ActionEvent event)
    {
        reply = input.getText();
        System.out.println("\nYou said: " + reply + "\n");
        input.clear();

        view.setImage(world.currentRoom.image);
        world.currentRoom.readScript(reply);
    }
}

class Console extends OutputStream
{
    TextArea output;

    public Console(TextArea ta)
    {
        this.output = ta;
    }

    @Override
    public void write(int i) throws IOException
    {
        output.appendText(String.valueOf((char) i));
    }

}