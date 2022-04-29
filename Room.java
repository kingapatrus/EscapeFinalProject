import javafx.scene.image.Image;

abstract class Room extends ScriptReader
{
    Image image;
    
    Room(World world)
    {
        super(world);
    }
}
