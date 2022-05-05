class World
{
    //Rooms
    Chair chair;
    Color color;
    Bowling bowling;
    
    Room currentRoom;
    Player player;
    
    World()
    {
        chair = new Chair(this);
        color = new Color(this);
        bowling = new Bowling(this);
        
        this.currentRoom = chair;
        player = new Player(this);
    }

    void restart()
    {
        chair = new Chair(this);
        color = new Color(this);
        bowling = new Bowling(this);
        
        this.currentRoom = chair;
        player = new Player(this);
        
    }
    
    void moveTo(Room room)
    {
        this.currentRoom = room;
    }
}