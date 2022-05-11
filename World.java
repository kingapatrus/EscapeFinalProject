class World
{
    //Rooms
    Chair chair;
    Color color;
    Escape escape;
    
    Room currentRoom;
    Player player;
    
    World()
    {
        chair = new Chair(this);
        color = new Color(this);
        escape = new Escape(this);
        
        this.currentRoom = chair;
        player = new Player(this);
    }

    void restart()
    {
        chair = new Chair(this);
        color = new Color(this);
        escape = new Escape(this);
        
        this.currentRoom = chair;
        player = new Player(this);
        
    }
    
    void moveTo(Room room)
    {
        this.currentRoom = room;
    }
}