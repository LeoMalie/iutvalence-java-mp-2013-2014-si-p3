package fr.iutvalence.java.mp.p3;

/**
 * Main class provides to start the game with : - Ascii display - Keyboard
 * directions
 * 
 * @author maliel
 */
public class AsciiKeyboardMain
{
    /**
     * Display road test for now
     * 
     * @param args
     *            not specified
     */
    public static void main(String[] args)
    {
        AsynchronousModeGame a = new AsynchronousModeGame("Jackson", new AsciiDisplay());
        Player p = new KeyboardPlayer();
        ThreadScroll s = new ThreadScroll(a, a.getScore());
        ThreadDirection d = new ThreadDirection(a, p);
        
        // Lancement des threads 
        s.start();
        d.start();
        
        // Lancement de la partie
        a.play();
    }

}
