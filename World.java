class World
{
    //Rooms
    Jungle jungle;
    Desert desert;
    Dessert dessert;
    
    Room currentRoom;
    Player player;
    
    World()
    {
        jungle = new Jungle(this);
        desert = new Desert(this);
        dessert = new Dessert(this);
        
        this.currentRoom = jungle;
        player = new Player(this);
    }

    void restart()
    {
        jungle = new Jungle(this);
        desert = new Desert(this);
        dessert = new Dessert(this);
        
        this.currentRoom = jungle;
        player = new Player(this);
        
    }
    
    void moveTo(Room room)
    {
        this.currentRoom = room;
    }
}