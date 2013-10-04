package fr.iutvalence.java.mp.p3;

// TODO FIXED comment is not understandable
/**
 * This class provides operations with a car
 * @author maliel
 *
 */
// TODO FIXED Create constructor for enemy car
public class Car
{
    /**
     * Width size of the array[SIZE_WIDTH][].
     */
    // TODO FIXED comply with naming conventions
    private final static int SIZE_WIDTH = 10;
    
    /**
     * Height size of the array[][SIZE_HEIGHT].
     */
    // TODO FIXED comply with naming conventions
    private final static int SIZE_HEIGHT = 20;  
    
    /**
     * Player car value
     */
    public static final int PLAYER = 1;
    
    /**
     * Enemy car value
     */
    public static final int ENEMY = 2;
    
    /**
     * Value for a destroyed car
     */
    public static final boolean DEAD = false;
    
    /**
     * Value for an "alive" car
     */
    public static final boolean ALIVE = true;
    
    /**
     * Car position
     */
    private Position position;
    
    /**
     * Car type (USERCAR/BOTCAR)
     */
    // TODO FIXED rename field
    private Square kindOfCar;
    
    /**
     * State car value (DEAD/ALIVE)
     */
    // TODO FIXED rename field
    private boolean aliveCar;
    
    // TODO FIXED write a "real" comment
    /**
     * Constructor provides to create an user or a bot car
     * @param kindOfCar kind of car (user/bot), if empty no operations
     */
    public Car(Square kindOfCar)
    {
        if (kindOfCar == Square.USER_CAR)
        {
            this.aliveCar = ALIVE;
            this.position = new Position(SIZE_WIDTH / 2, SIZE_HEIGHT - 1);
            this.kindOfCar = Square.USER_CAR;
        }
        else if (kindOfCar == Square.USER_CAR)
        {
            int max = SIZE_WIDTH;
            int min = 0;
            int randomWidth;
            randomWidth = min + (int)(Math.random() * ((max - min) + 1));
            this.aliveCar = ALIVE;
            this.position = new Position(randomWidth, 0);
            this.kindOfCar = Square.BOT_CAR;
        }
    }
    
    // TODO FIXED rename method (more explicit)
    // TODO FIXED finish writing comment
    /**
     * this function provides to get the current position of a car
     * @return car current position (x,y)
     */
    public Position getPositionCar()
    {
        return this.position;
    }
    
    // TODO FIXED finish writing comment
    /**
     * this function provides to get the current state of a car
     * @return car state
     */
    public boolean getState()
    {
        return this.aliveCar;
    }
    
    // TODO FIXED finish writing comment
    /**
     * this function provides to get the kind of a car
     * @return car type
     */
    public Square getType()
    {
        return this.kindOfCar;
    }
    
    /**
     * Destroy a car (ALIVE to DEAD)
     */
    public void destroyCar()
    {
        this.aliveCar = DEAD;
    }    
}
