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
    public void displayScore(int Score);

    /**
     * Area display
     * 
     * @param Area
     *            road to display
     */
    public void displayArea(AreaContent[][] Area);

}
