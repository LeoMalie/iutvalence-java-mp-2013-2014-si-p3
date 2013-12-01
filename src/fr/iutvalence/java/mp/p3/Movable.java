package fr.iutvalence.java.mp.p3;

/**
 * Interface for the user car movements (allow to use keyboard player or random)
 * @author maliel
 *
 */
public interface Movable
{
    /**
     * This function provides to move the user car (created in the area
     * constructor), set EMPTY value in old car position and USER_CAR in the new
     * 
     * @param direction
     *            direction
     * @return true if no collision, else false
     */
    public boolean move(Direction direction);
    
}
