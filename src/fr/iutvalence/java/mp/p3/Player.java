package fr.iutvalence.java.mp.p3;

/**
 * Control interface, provides to get a direction from the player
 * Implemented by KeyboardPlayer (user) and RandomPlayer (bot)
 * @author maliel
 *
 */
//TODO FIXED you should separate the data associated with the player from the way the player
//interacts with the game
abstract class Player
{
    /**
     * Init score when a player is created
     */
    public static final int INITIAL_SCORE = 0;
    
    /**
     * Current player pseudo.
     */
    protected String name;

    /**
     * Player car
     */
    // TODO (fix) this field is already declared in Area
    protected Car userCar;

    /**
     * Player score
     */
    protected int score;

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

    /**
     * This function provides to get the player car
     * 
     * @return player car
     */
    public Car getCar()
    {
        return this.userCar;
    }
    
    /**
     * Get a direction according to the class of player selected
     * @return direction to move to
     */
    public abstract Direction getDirection();
}
