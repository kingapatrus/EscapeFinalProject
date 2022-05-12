import javafx.scene.image.Image;
,
class Over extends Room
{
    Over(World world)
    {
        super(world);
        image = new Image("gameover.jpg");
        currentScript = 1;
    }
    void readScript(String lastReply)
    {
        if(currentScript = 1)
        {
            image = new Image("gameover.jpg");
                System.out.println("AHHHHHHHHH!");
                System.out.println("HELP ME!! WHERE AM I!!");
                System.out.println("Oh no. Someone came in and subdued you because of your unpredictable state.");
                System.out.println("You are very dead. Game over.");
                System.out.println("A strange shadowy figure comes in and examines your body. 'Test Subject 504 was too weak. Bring in 505.'");
                System.out.println("Press Enter to continue.");
                
        }
    }
}