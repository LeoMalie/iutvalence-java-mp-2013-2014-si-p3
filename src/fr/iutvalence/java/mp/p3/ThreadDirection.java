package fr.iutvalence.java.mp.p3;

/**
 * Thread for the player directions
 * @author maliel
 *
 */
public class ThreadDirection extends Thread
{

    /**
     * Position given by the player
     */
    private Position pos;
    
    /**
     * Player type
     */
    private Player player;

    /**
     * Constructor
     * @param pos position
     * @param player player
     */
    public ThreadDirection(Position pos, Player player)
    {
            this.pos = pos;
            this.player = player;
    }

    /**
     * Enable to start the thread
     */
    public void run()
    {
        //TODO a finir
            //Direction mouvement = Direction.FIXED;
            //while (this.pos.translateTo(this.player.getDirection()))
            //{
            
            //}
    }
}
