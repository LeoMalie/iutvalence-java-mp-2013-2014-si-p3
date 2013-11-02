package fr.iutvalence.java.mp.p3;

/**
 * This class provides to up or get the current game score, and get the pseudo attached with
 * @author maliel
 */
public class Score
{
    /**
     * Init score when a player is created
     */
    public static final int INITIAL_SCORE = 0;
    
    /**
     * Current player pseudo for this score.
     */
    private String name;

    // TODO FIXED this field is already declared in Area
 
    /**
     * Player score
     */
    private int score;

    /**
     * This function provides to grow up the player score
     */
    public void upScore()
    {
        this.score += 100;
    }

    /**
     * This function provides to get the player name
     * 
     * @return player name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * This function provides to get the player score
     * 
     * @return player score
     */
    public int getScore()
    {
        return this.score;
    }
    
}
