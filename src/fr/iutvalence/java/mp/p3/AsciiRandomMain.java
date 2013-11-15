package fr.iutvalence.java.mp.p3;

/**
 * Main class provides to start the game with :
 *          - Ascii display
 *          - Random directions
 * 
 * @author maliel
 */ 
public class AsciiRandomMain
{
    /**
     * Display road test for now
     * 
     * @param args
     *            not specified
     */
    public static void main(String[] args)
    {
        GameScrollAsyncDeplaAsync a = new GameScrollAsyncDeplaAsync("Jackson", new AsciiDisplay(), new RandomPlayer());
        // a.play();
        ThreadScroll s = new ThreadScroll(a);
        ThreadDirection d = new ThreadDirection(a, a.getPlayer());
        s.start();
        d.start();
    }

}
