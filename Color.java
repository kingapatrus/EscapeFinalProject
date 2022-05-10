import javafx.scene.image.Image;

class Color extends Room
{
    Color(World world)
    {
        super(world);
        this.image = new Image("color.jpg");
        this.currentScript = 1;
    }

    void readScript(String lastReply)
    {
        if (currentScript == 1)
        {
            System.out.println(" The door opens up to another room, this one full of colaging colors. You feel discouraged and exausted..");
            System.out.println("A cool and refreshing breeze blows from the west.");
            System.out.println("You can LOOK around or go BACK to the safety of the first creepy room.");
            System.out.println("What do you want to do?");
            currentScript = 2;
        }
        else if (currentScript == 2)
        {
            if (lastReply.toUpperCase().equals("LOOK"))
            {
                System.out.println("You decide on taking a look around this room. It is blindlingly bright. The walls are collauges of colors and shapes..");
                System.out.println("Are they moving or are you just getting dizzy?");
                System.out.println("OH look its the clue ");
                System.out.println("Hmmm... Maybe the shapes are the puzzle?.");
                System.out.println("You can MOVE closer to the walls and get a close look, or ASK the voice in the ceiling for help.");
                System.out.println("What do you want to do?");
                currentScript = 3;
            }
            else if (lastReply.toUpperCase().equals("BACK"))
            {
                System.out.println("Ummm. Okay? You wanted to go backwards in the escape room? I guess your never getting home...");
                System.out.println("You retrace your steps to the first room with the creepy chair.");
                System.out.println("Press Enter to continue.");
                currentScript = 1;
                world.moveTo(world.chair);
            }
            //else if (lastReply.toUpperCase().equals("BACK"))
            //{
               //nothing has changed. It doesn't seem like anything in here will help us currently.
               //System.out.println("You can go FORWARD and go back to the colorful room, or STAY in this room and catch your breath.").
               //System.out.println("What do you want to do?");
               //currentScript = 2;
            //}
            else
            {
                System.out.println("Hmm... I'm not sure what '" + lastReply + "' means.");
                System.out.println("You can go BACK to the first room, or LOOK around this bright room.");
            }
        }
        else if (currentScript == 3)
        {
            if (lastReply.toUpperCase().equals("A"))
            {
                System.out.println("YAY YOU DID IT. YOu try to push the door this time and it creacks open, the room beyond is completely dark though You hesitantly step through the threshold.");
                System.out.println("Press Enter to continue.");
                currentScript = 1;
                world.moveTo(world.bowling);
            }
            else if (lastReply.toUpperCase().equals("BACK"))
            {
                System.out.println("Ummm. Okay? You wanted to go backwards in the escape room? I guess your never getting home...");
                System.out.println("You retrace your steps to the first room with the creepy chair.");
                System.out.println("Press Enter to continue.");
                currentScript = 1;
                world.moveTo(world.chair);
            }
            else
            {
                System.out.println("Hmm... I'm not sure what '" + lastReply + "' means.");
                System.out.println("You can go BACK to the bland chair room, or LOOK around for clues.");
            }
        }
    }

}