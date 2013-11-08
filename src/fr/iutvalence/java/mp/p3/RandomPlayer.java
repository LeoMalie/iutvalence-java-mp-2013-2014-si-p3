package fr.iutvalence.java.mp.p3;

/**
 * Test class for a player with random movements
 * @author maliel
 *
 */ 
public class RandomPlayer implements Player
{
    
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
