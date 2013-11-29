package fr.iutvalence.java.mp.p3;

/**
 * Main class provides to start the game with : - Ascii display - Random
 * directions
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
        GameDeplaAsync a = new GameDeplaAsync("Jackson", new AsciiDisplay(), new RandomPlayer());
        
        ThreadScroll s = new ThreadScroll(a);
        ThreadDirection d = new ThreadDirection(a, a.getPlayer());
        
        // Lancement des threads 
        s.start();
        d.start();
        
        // Lancement de la partie
        a.play();
        
    }

}
