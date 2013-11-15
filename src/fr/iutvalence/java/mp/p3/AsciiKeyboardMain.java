package fr.iutvalence.java.mp.p3;

/**
 * Main class provides to start the game with :
 *          - Ascii display
 *          - Keyboard directions
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
        new GameScrollAsyncDeplaAsync("Jackson", new AsciiDisplay(), new KeyboardPlayer()).play();
    }

}
