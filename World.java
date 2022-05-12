class World
{
    //Rooms
    Chair chair;
    Escape escape;
    Over over;
    
    Room currentRoom;
    Player player;
    
    World()
    {
        chair = new Chair(this);
        escape = new Escape(this);
        over = new Over(this);
        
        this.currentRoom = chair;
        player = new Player(this);
    }

    void restart()
    {
        chair = new Chair(this);
        escape = new Escape(this);
        over = new Over(this);
        
        this.currentRoom = chair;
        player = new Player(this);
        
    }
    
    void moveTo(Room room)
    {
        this.currentRoom = room;
        
    }
}