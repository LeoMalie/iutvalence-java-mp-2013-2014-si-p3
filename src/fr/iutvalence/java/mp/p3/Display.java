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
     * @param Score
     *            score to display
     */
    // TODO (fix) comply with naming conventions (parameters)
    public void displayScore(int Score);

    /**
     * Area display
     * 
     * @param Area
     *            road to display
     */
    // TODO (fix) comply with naming conventions (parameters)
    public void displayArea(AreaContent[][] Area);

}
