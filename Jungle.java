import javafx.scene.image.Image;

class Jungle extends Room
{
    boolean hasSpoon;
    boolean hasRevealedDesert;

    Jungle(World world)
    {
        super(world);
    ;
        currentScript = 1;
        hasSpoon = true;
        hasRevealedDesert = false;
    }

    void readScript(String lastReply)
    {
        if (currentScript == 1)
        {
            System.out.println("You are in a jungle full of stinging insects. Horrible bird noises fill the air.");
            System.out.println("Are you dreaming? How did you end up here?\n...");
            System.out.println("You can CLIMB a tree or SEARCH the ground around you.");
            System.out.println("What do you want to do?");
            currentScript = 2;
        }
        else if (currentScript == 2)
        {
            if (lastReply.toUpperCase().equals("CLIMB"))
            {
                System.out.println("You bravely climb the tree. Several brightly colored birds fly away as you ascend higher in the canopy.");
                System.out.println("As you reach the top of the tree, you see a desert in the distance to the south.");
                System.out.println("You can CLIMB down or SWING from a jungle vine.");
                System.out.println("What do you want to do?");
                hasRevealedDesert = true;
                currentScript = 3;
            }
            else if (lastReply.toUpperCase().equals("SEARCH"))
            {
                System.out.println("You squat down and begin to search for clues. There are many crawling insects on the ground, but nothing else that is very interesting.");
                if (this.hasSpoon)
                {
                    System.out.println("Just as you are standing to your feet, you notice a shiny metallic object underneath a fern.");
                    System.out.println("It's a spoon. Weird.");
                    System.out.println("You put the spoon in your pocket for safe-keeping. You never know what might be useful in a survival situation.");
                    this.hasSpoon = false;
                    world.player.hasSpoon = true;
                    System.out.println("You can CLIMB the tree or SEARCH the jungle again.");
                    System.out.println("What do you want to do?");
                }
            }
            else if (lastReply.toUpperCase().equals("SOUTH") && hasRevealedDesert)
            {
                System.out.println("You head south to escape the jungle. The plants begin to thin out as you approach the edge of the jungle.");
                System.out.println("Press Enter to continue.");
                currentScript = 1;
                world.moveTo(world.desert);
            }
            else
            {
                System.out.println("Hmm... I'm not sure what '" + lastReply + "' means.");
                System.out.println("You can CLIMB a tree or SEARCH the ground around you.");
                if (hasRevealedDesert)
                {
                    System.out.println("You can also head SOUTH to leave the desert.");
                }
                System.out.println("What do you want to do?");
            }
        }
        else if (currentScript == 3)
        {
            if (lastReply.toUpperCase().equals("CLIMB"))
            {
                System.out.println("Swinging on a jungle vine would have been very foolish. " +
                    "You sensibly and safely climb down the tree.");
                System.out.println("You are back on the jungle floor.");
                System.out.println("You can CLIMB the tree again, SEARCH the ground around you, or go SOUTH to the desert.");
                System.out.println("What do you want to do?");
                currentScript = 2;
            }
            else if (lastReply.toUpperCase().equals("SWING"))
            {
                System.out.println("Weeee!");
                System.out.println("CRASH!");
                System.out.println("Oh dear. You have slammed into the side of another tree.");
                System.out.println("You are very dead. Game over.");
                System.out.println("The mists swirl around you and you wake up in a strange but familiar place...");
                System.out.println("Press Enter to continue.");
                world.restart();
            }
            else
            {
                System.out.println("Hmm... I'm not sure what '" + lastReply + "' means.");
                System.out.println("You can CLIMB down the tree or SWING on a jungle vine.");
                System.out.println("What do you want to do?");
            }
        }
    }

}