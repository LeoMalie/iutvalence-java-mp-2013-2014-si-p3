package fr.iutvalence.java.mp.p3;

/**
 * Thread for the area scroll + up score
 * 
 * @author maliel
 * 
 */
public class ThreadScroll extends Thread
{
    /**
     * Area to scroll
     */
    private final Scrollable game;

    /**
     * Score to up
     */
    private final Score score;
    
    /**
     * Constructor with an async game
     * 
     * @param a
     *            asyn game
     * @param s 
     *              score
     */
    public ThreadScroll(Scrollable a, Score s)
    {
        this.game = a;
        this.score = s;
        
    }

    /**
     * Enable to start the thread
     */
    @Override
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
            this.score.upScore();
        }

    }
}
