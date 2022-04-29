import javafx.scene.image.Image;

class Desert extends Room
{
    Desert(World world)
    {
        super(world);
        this.image = new Image("desert.jpg");
        this.currentScript = 1;
    }

    void readScript(String lastReply)
    {
        if (currentScript == 1)
        {
            System.out.println("You have entered a desert. The sun is hot. The sand is sandy. You are beginning to feel faint.");
            System.out.println("A cool and refreshing breeze blows from the west.");
            System.out.println("You can LOOK around or go NORTH back to the jungle.");
            System.out.println("What do you want to do?");
            currentScript = 2;
        }
        else if (currentScript == 2)
        {
            if (lastReply.toUpperCase().equals("LOOK"))
            {
                System.out.println("You trudge to the top of a large sand dune. The heat of the sun is making you delerious.");
                System.out.println("In the distance you see mountains of... ice cream?");
                System.out.println("Are you hallucinating? You see giant dessert to the west.");
                System.out.println("Yes, that's right, a dessert in the desert. A desert dessert.");
                System.out.println("You can go NORTH back to the jungle or head WEST to the dessert.");
                System.out.println("What do you want to do?");
                currentScript = 3;
            }
            else if (lastReply.toUpperCase().equals("NORTH"))
            {
                System.out.println("You have had just about enough of this place.");
                System.out.println("You walk across the dunes heading back to the jungle.");
                System.out.println("Press Enter to continue.");
                currentScript = 1;
                world.moveTo(world.jungle);
            }
            else
            {
                System.out.println("Hmm... I'm not sure what '" + lastReply + "' means.");
                System.out.println("You can go NORTH to the jungle or LOOK around.");
            }
        }
        else if (currentScript == 3)
        {
            if (lastReply.toUpperCase().equals("WEST"))
            {
                System.out.println("You stumble across the desert following the sweet smell of ice cream in the distance.");
                System.out.println("Press Enter to continue.");
                currentScript = 1;
                world.moveTo(world.dessert);
            }
            else if (lastReply.toUpperCase().equals("NORTH"))
            {
                System.out.println("You have had just about enough of this place.");
                System.out.println("You walk across the dunes heading back to the jungle.");
                System.out.println("Press Enter to continue.");
                currentScript = 1;
                world.moveTo(world.jungle);
            }
            else
            {
                System.out.println("Hmm... I'm not sure what '" + lastReply + "' means.");
                System.out.println("You can go NORTH to the jungle or WEST to the dessert.");
            }
        }
    }

}