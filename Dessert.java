import javafx.scene.image.Image;

class Dessert extends Room
{
    Dessert(World world)
    {
        super(world);
        this.image = new Image("dessert.jpg");
        this.currentScript = 1;
    }

    void readScript(String lastReply)
    {
        if (currentScript == 1 && !world.player.hasSpoon)
        {
            System.out.println("It's no mirage! You have found an oasis of delicious dessert.");
            System.out.println("Too bad you don't have a spoon. You remember seeing the glint of something shiny in the jungle.");
            System.out.println("You can go EAST back to the desert or you can POUT about your cruel fate.");
            System.out.println("What do you want to do?");
            currentScript = 2;
        }
        else if (currentScript == 1 && world.player.hasSpoon)
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
                world.moveTo(world.desert);
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
                world.moveTo(world.desert);
            }
            else if (lastReply.toUpperCase().equals("EAT"))
            {
                System.out.println("Your dreams have come true! The ice cream is delicious!");
                System.out.println("Or is this too good to be true? Were you dreaming this entire time?");
                System.out.println("You win the game!");
                System.out.println("You feel yourself drifting back to sleep...");
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