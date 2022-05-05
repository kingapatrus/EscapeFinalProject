import javafx.scene.image.Image;

class Bowling extends Room
{
    Bowling(World world)
    {
        super(world);
        this.image = new Image("dessert.jpg");
        this.currentScript = 1;
    }

    void readScript(String lastReply)
    {
        if (currentScript == 1 && !world.player.hasKey)
        {
            System.out.println("It's no mirage! You have found an oasis of delicious dessert.");
            System.out.println("Too bad you don't have a spoon. You remember seeing the glint of something shiny in the jungle.");
            System.out.println("You can go EAST back to the desert or you can POUT about your cruel fate.");
            System.out.println("What do you want to do?");
            currentScript = 2;
        }
        else if (currentScript == 1 && world.player.hasKey)
        {
            System.out.println("It's no mirage! You have found an oasis of delicious dessert.");
            System.out.println("And you have a spoon! What good luck!");
            System.out.println("You can go EAST back to the desert or you can EAT the ice cream.");
            System.out.println("What do you want to do?");
            currentScript = 3;
        }
        else if (currentScript == 2)
        {
            if (lastReply.toUpperCase().equals("EAST"))
            {
                System.out.println("You walk back to the desert.");
                System.out.println("Press Enter to continue.");
                currentScript = 1;
                world.moveTo(world.color);
            }
            else if (lastReply.toUpperCase().equals("POUT"))
            {
                System.out.println("Waaah.");
                System.out.println("Do you feel better now?");
                System.out.println("You can go EAST back to the desert or you can POUT again.");
                System.out.println("What do you want to do?");
            }
            else
            {
                System.out.println("Hmm... I'm not sure what '" + lastReply + "' means.");
                System.out.println("You can go EAST to the desert or POUT about your cruel fate.");
            }
        }
        else if (currentScript == 3)
        {
            if (lastReply.toUpperCase().equals("EAST"))
            {
                System.out.println("Why would you leave such a wonderful feast?");
                System.out.println("Oh well. You walk back to the desert.");
                System.out.println("Press Enter to continue.");
                currentScript = 1;
                world.moveTo(world.color);
            }
            else if (lastReply.toUpperCase().equals("ESCAPE"))
            {
                System.out.println("FINALLY! You have completed these tortorous tasks. You are now free. Make a run for it!");
                System.out.println("You slam open the door and discover yourself in the middle of a crowded city. You hastidly wave down a taxi and paranoidly make your way home. ");
                System.out.println("You finally settle back into bed. You see something on your desk. Its the money that was promised! Along with a card...");    
                System.out.println("'YOU ESCAPED, Congratulations.'");
                System.out.println("You then hear your mom get home, and knowing your finally safe you collapse from exhaustion.");
                System.out.println("Press Enter to continue.");
                world.restart();
            }
            else
            {
                System.out.println("Hmm... I'm not sure what '" + lastReply + "' means.");
                System.out.println("You can go EAST to the desert or EAT the ice cream.");
            }
        }

    }
}