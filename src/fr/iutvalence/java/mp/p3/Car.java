package fr.iutvalence.java.mp.p3;

// TODO FIXED comment is not understandable
/**
 * This class is still useless but we don't want to delete it yet, some
 * functions implemented could be useful in another class
 * @author maliel
 *
 */
public class Car
{
    /**
     * Width size of the array[SIZE_WIDTH][].
     */
    private final static int SIZE_WIDTH = 10;
    
    /**
     * Height size of the array[][SIZE_HEIGHT].
     */
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
    private Square kindOfCar;
    
    /**
     * State car value (DEAD/ALIVE)
     */
    // TODO FIXED rename field
    private boolean isAlive;
    
    // TODO FIXED write a "real" comment
    /**
     * Constructor provides to create an user or a bot car
     * @param kindOfCar kind of car (user/bot), if empty no operations
     */
    public Car(Square kindOfCar)
    {
        //TODO switch
        if (kindOfCar == Square.USER_CAR)
        {
            // TODO (fix) use direct boolea values instead of constants
            this.isAlive = ALIVE;
            this.position = new Position(SIZE_WIDTH / 2, SIZE_HEIGHT - 1);
            this.kindOfCar = Square.USER_CAR;
        }
        else if (kindOfCar == Square.BOT_CAR)
        {
            int max = SIZE_WIDTH;
            int min = 0;
            int randomWidth;
            randomWidth = min + (int)(Math.random() * max);
            this.isAlive = ALIVE;
            this.position = new Position(randomWidth, 0);
            this.kindOfCar = Square.BOT_CAR;
        }
    }
    
    /**
     * this function provides to get the current position of a car
     * @return car current position (x,y)
     */
    public Position getPosition()
    {
        return this.position;
    }
    
    // TODO FIXED finish writing comment
    /**
     * this function provides to get the current state of a car
     * @return car state
     */
    public boolean isAlive()
    {
        return this.isAlive;
    }
    
    // TODO FIXED finish writing comment
    /**
     * this function provides to get the kind of a car
     * @return car type
     */
    public Square getKind()
    {
        return this.kindOfCar;
    }
    
    /**
     * Destroy a car (ALIVE to DEAD)
     */
    public void destroyCar()
    {
        this.isAlive = DEAD;
    }    
}
