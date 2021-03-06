import javafx.scene.image.Image;

class Chair extends Room
{
    boolean hasRevealedEscape;
    int lives;
    Chair(World world)
    {
        super(world);
        image = new Image("room.jpg");
        currentScript = 1;
        hasRevealedEscape = false;
    }
    void readScript(String lastReply)
    { 
        if (currentScript == 1)
        {
            System.out.println("You're in a room, you wake up disoriented and strapped to a metal chair. It's earily silent.");
            System.out.println("Are you dreaming? How did you end up here? Why is it so eerie?\n...");
            System.out.println("You can SCREAM or INVESTIGATE the restraints.");
            System.out.println("What do you want to do?");
            currentScript = 2;
        }
        else if (currentScript == 2)
        {
            if (lastReply.toUpperCase().equals("SCREAM"))
            {
                System.out.println("You scream at the top of your lungs. The horrid sound ricochets around the blank walls..");
                System.out.println("A voice announced that you must retain your composure or they will be forced to take means. You begin to get your bearings, you see a painting that is framed infront of you.");
                System.out.println("You can continue to PANIC or EXPLORE the restraints and investigate the room.");
                System.out.println("What do you want to do?");
                currentScript = 3;
            }
            else if (lastReply.toUpperCase().equals("INVESTIGATE"))
            {
                System.out.println("You start investigating the restraints around your arms and legs. You see that there is a little hole on the side. You contort your body to search through your pocket for a bobby pin.");
                System.out.println("While you are trying to sort through your pockets for something to escape with, you feel a foreign cold object.");
                System.out.println("It's a copper key. This keeps getting stranger and stranger.");
                world.player.hasKey = true;
                System.out.println("You put the key back in your pocket and grab the bobby pin. Maybe the key will help you escape.");
                System.out.println("You can BREAK the restraints or LOOK around the room.");
                System.out.println("What do you want to do?");
                currentScript = 3;
            }
                   }
        if (currentScript == 3)
        {
            if (lastReply.toUpperCase().equals("LOOK"))
            {
                System.out.println("Trying to escape would've been silly of you so soon. You don't even know where you are yet.");
                System.out.println(" You take a look around. You are in a medium sized room. The walls are all different monotone shades. White, Black, Grey, and one is a deep Maroon.");
                System.out.println("Do want to take a closer to the frame hanging on the maroon wall infront of you?");
                System.out.println("You can BREAK free and look at the wall, or PANIC because this place is freaky.");
                System.out.println("What do you want to do?");
                currentScript = 4;
            }
            else if (lastReply.toUpperCase().equals("EXPLORE"))
            {
                System.out.println("You start investigating the restraints around your arms and legs. You see that there is a little hole on the side. You contort your body to search through your pocket for a bobby pin.");

                System.out.println("While you are trying to sort through your pockets for something to escape with, you feel a foreign cold object.");
                System.out.println("It's a copper key. This keeps getting stranger and stranger.");
                System.out.println("You put the key back in your pocket and grab the bobby pin. Maybe the key will help you escape.");

                world.player.hasKey = true;
                System.out.println("You can BREAK the restraints or LOOK around the room.");
                System.out.println("What do you want to do?");

                currentScript = 4;

            }

            else if (lastReply.toUpperCase().equals("BREAK"))
            {
                System.out.println("The restraints are actually quite simple. There is a little hole for the key that you can easily break free from.");
                System.out.println("You grab that bobby pin and go to town on the locks.");
                System.out.println("Yes! You got all the restraints free!");
                System.out.println("Now you can MOVE to the box to escape.");
                hasRevealedEscape = true; 
                currentScript = 4;
            }
            else if (lastReply.toUpperCase().equals("PANIC"))
            {
                world.moveTo(world.over);
            }
        }
        if (currentScript == 4)
        {            
            if (lastReply.toUpperCase().equals("BREAK"))
            {
                System.out.println("The restraints are actually quite simple. There is a little hole for the key that you can easily break free from.");
                System.out.println("You grab that bobby pin and go to town on the locks.");
                System.out.println("Yes! You got all the restraints free!");
                System.out.println("Now you can MOVE to the box to escape.");
                currentScript = 5;
            }
            else if (lastReply.toUpperCase().equals("MOVE") && hasRevealedEscape == true)
            {
                System.out.println("You made it, you freed yourself from the restraints, you completed the clue in the box which you unlocked with the key.");
                System.out.println("Now all you need to do is open the door with the key, and leave");
                System.out.println("You insert the key, turn it and reach for the door knob. You turn it and are blinded by the bright light");
                System.out.println("Press Enter to continue.");
                currentScript = 6;
                world.moveTo(world.escape);
            }
            else if (lastReply.toUpperCase().equals("PANIC"))
            {
                world.moveTo(world.over);
            }
            else if(lastReply.toUpperCase().equals("LOOK"))
            {
                System.out.println("Trying to escape would've been silly of you so soon. You don't even know where you are yet.");
                System.out.println(" You take a look around. You are in a medium sized room. The walls are all different monotone shades. White, Black, Grey, and one is a deep Maroon.");
                System.out.println("Do want to take a closer to the frame hanging on the maroon wall infront of you?");
                System.out.println("You can BREAK free and look at the wall, or PANIC because this place is freaky.");
                System.out.println("What do you want to do?");
                currentScript = 5;
            }
          }
          if (currentScript == 5 )
             {
            if (lastReply.toUpperCase().equals("MOVE") )
            {
                System.out.println("You made it, you freed yourself from the restraints, you completed the clue in the box which you unlocked with the key.");
                System.out.println("Now all you need to do is open the door with the key, and leave");
                System.out.println("You insert the key, turn it and reach for the door knob. You turn it and are blinded by the bright light");
                System.out.println("Press Enter to continue.");
                currentScript = 6;
                world.moveTo(world.escape);
           }
        }

    }
}


/* if (currentScript == 4)
{
if (lastReply.toUpperCase().equals(""))
{
System.out.println(".");
System.out.println(" ");
System.out.println("");
System.out.println("");
System.out.println("");
currentScript = 5;
}
else if (lastReply.toUpperCase().equals(""))
{
System.out.println(".");
System.out.println(" ");
System.out.println("");
System.out.println("");
System.out.println("");
currentScript = 5;
}






 /*else 
            {


                System.out.println("You can also PANIC if you are overwhelmed.");
            }
            System.out.println("You can SCREAM or INVESTIGATE.");
            System.out.println("What do you want to do?");

                System.out.println("Hmm... I'm not sure what '" + lastReply + "' means.");
                if (hasRevealedColor)
                {
                    System.out.println("You can also PANIC if you are overwhelmed.");
                }
                System.out.println("You can SCREAM or EXPLORE.");
                System.out.println("What do you want to do?");
            }*/
        
/*else
{
System.out.println("Hmm... I'm not sure what '" + lastReply + "' means.");
System.out.println("You can  or .");
System.out.println("What do you want to do?");
}
}

//hasRevealedColor = true;
/*
if (hasRevealedColor)
{
System.out.println("You can also PANIC if you are overwhelmed.");
}

            
/* else if (lastReply.toUpperCase().equals("EXIT") && hasRevealedColor)
{
System.out.println("A overhead voice announces : 'You inserted the key and correctly answered the riddle. You may now escape.'.");
System.out.println("Feeling a spark of hope, you reach for the entrance and give it a push.");
System.out.println("Press Enter to continue.");
currentScript = 1;
world.moveTo(world.color);
 * 
 */