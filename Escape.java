import javafx.scene.image.Image;

class Escape extends Room
{
    Escape(World world)
    {
        super(world);
        this.image = new Image("escape.jpg");
        this.currentScript = 1;
    }

    void readScript(String lastReply)
    {
       if (currentScript == 1 )
            {
                System.out.println("FINALLY! You have completed these tortorous tasks. You are now free. Make a run for it!");
                System.out.println("You slam open the door and discover yourself in the middle of a crowded city. You hastidly wave down a taxi and paranoidly make your way home. ");
                System.out.println("You finally settle back into bed. You see something on your desk. Its the money that was promised! Along with a card...");    
                System.out.println("'YOU ESCAPED, Congratulations.'");
                System.out.println("You then hear your mom get home, and knowing your finally safe you collapse from exhaustion.");
                System.out.println("Press Enter to continue.");
                world.restart();
         
            }
        }

    }
