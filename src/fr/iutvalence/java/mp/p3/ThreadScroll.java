package fr.iutvalence.java.mp.p3;

/**
 * Thread for the area scroll
 * 
 * @author maliel
 * 
 */
public class ThreadScroll extends Thread
{
    /**
     * Area to scroll
     */
    // TODO (fix) this is not the right type to use here
    private GameScrollAsyncDeplaSync game;

    /**
     * Constructor with an async game
     * 
     * @param a
     *            asyn game
     */
    public ThreadScroll(GameScrollAsyncDeplaSync a)
    {
        this.game = a;
    }

    /**
     * Enable to start the thread
     */
    public void run()
    {
        while (this.game.scrollRoad())
        {
            try
            {
                sleep(250);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
}
