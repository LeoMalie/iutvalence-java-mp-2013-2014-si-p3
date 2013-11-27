package fr.iutvalence.java.mp.p3;


// TODO (fix) finish writing comment
/**
 * @author maliel
 *
 */
public interface Deplacement
{
    /**
     * This function provides to move the user car (created in the area
     * constructor), set EMPTY value in old car position and USER_CAR in the new
     * 
     * @param direction
     *            direction
     * @return true if no collision, else false
     */
    public boolean moveUserCar(Direction direction);
    
}
