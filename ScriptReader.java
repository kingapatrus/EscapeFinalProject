public abstract class ScriptReader
{
    World world;
    int currentScript = 0;
    
    ScriptReader(World world)
    {
        this.world = world;
    }
    
    /**
     * All Rooms and Characters need to override 
     */
    abstract void readScript(String lastReply);
}
