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
    // TODO FIXED this is not the right type to use here
    private Scrollable game;

    /**
     * Constructor with an async game
     * 
     * @param a
     *            asyn game
     */
    public ThreadScroll(Scrollable a)
    {
        this.game = a;
    }

    /**
     * Enable to start the thread
     */
    public void run()
    {
        while (this.game.scroll())
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
