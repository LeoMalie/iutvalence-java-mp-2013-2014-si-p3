package fr.iutvalence.java.mp.p3;

/**
 * This class provides to display the score and the road
 * 
 * @author maliel
 * 
 */ 
public interface Display
{
    /**
     * Score display
     * 
     * @param score
     *            score to display
     */
    // TODO FIXED comply with naming conventions (parameters)
    public void displayScore(int score);

    /**
     * Area display
     * 
     * @param area
     *            road to display
     */
    // TODO FIXED comply with naming conventions (parameters)
    public void displayArea(AreaContent[][] area);

}
