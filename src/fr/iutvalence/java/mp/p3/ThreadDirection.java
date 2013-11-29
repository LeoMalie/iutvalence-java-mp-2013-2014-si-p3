package fr.iutvalence.java.mp.p3;

//import java.util.Random;

/**
 * Thread for the player directions
 * 
 * @author maliel
 * 
 */
public class ThreadDirection extends Thread
{
    // TODO FIXED this is not the right type to use here
    /**
     * Position given by the player
     */
    private Deplacement game;

    /**
     * Player type
     */
    private Player player;

    /**
     * Constructor
     * 
     * @param game
     *            game
     * @param player
     *            player
     */
    public ThreadDirection(Deplacement game, Player player)
    {
        this.game = game;
        this.player = player;
    }

    /**
     * Enable to start the thread
     */
    public void run()
    {
        boolean moveUserOk = true;

        while (moveUserOk)
        {
            // 50% de chances de se déplacer
            //if (new Random().nextInt(2) == 0)
                moveUserOk = this.game.move(this.player.getDirection());

            
        }
    }
}
