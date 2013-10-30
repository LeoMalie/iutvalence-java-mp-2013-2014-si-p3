package fr.iutvalence.java.mp.p3;

/**
 * This class provides interactions with a movement (a horizontal direction :
 * LEFT/RIGHT/FIXED) from the player
 * 
 * @author maliel
 * 
 */
// TODO (fix) you should separate the data associated with the player from the way the player
// interacts with the game
public class Player
{
    /**
     * Init score when a player is created
     */
    public static final int INITIAL_SCORE = 0;

    /**
     * Current player pseudo.
     */
    private String name;

    /**
     * Player car
     */
    // TODO (fix) this field is already declared in Area
    private Car userCar;

    /**
     * Player score
     */
    private int score;

   
    /**
     * This constructor provides to create a new player with a pseudo and a
     * default score
     * 
     * @param userName
     *            chosen by the user
     */
    public Player(String userName)
    {
        this.name = userName;
        this.score = INITIAL_SCORE;
        this.userCar = new Car(true);
    }

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
     * This function provides to get a direction enter by the user keyboard char
     * "4" for a left movement, char "6" for a right movement if other values,
     * the function return FIXED (= no movement)
     * 
     * @return direction
     */
    public Direction getDirection()
    {
        return Direction.getRandomDirection();
    }
}
