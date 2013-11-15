package fr.iutvalence.java.mp.p3;

/**
 * Main class provides to start the game with :
 *          - GUI display
 *          - Keyboard directions
 * 
 * @author maliel
 */ 
public class GraphicKeyboardMain
{
    /**
     * Display road test for now
     * 
     * @param args
     *            not specified
     */
    public static void main(String[] args)
    {
        new GameScrollAsyncDeplaAsync("Jackson", new GraphicDisplay(), new KeyboardPlayer()).play();
    }

}
