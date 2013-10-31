package fr.iutvalence.java.mp.p3;

/**
 * Test class for a player with random movements
 * @author maliel
 *
 */
public class RandomPlayer extends Player
{
    /**
     * Constructor with the pseudo
     * @param username pseudo of the player
     */
    public RandomPlayer(String username)
    {
        this.name = username;
        this.score = INITIAL_SCORE;
        this.userCar = new Car(true);
    }
    
    /**
     * Chose and return a random direction
     * @return random direction
     */
    @Override
    public Direction getDirection()
    {
        return Direction.getRandomDirection();
    }

}
