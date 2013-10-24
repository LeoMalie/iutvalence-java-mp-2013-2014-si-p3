package fr.iutvalence.java.mp.p3;

// TODO (fix) as this class is now useful, comment it properly
/**
 * This class is still useless but we don't want to delete it yet, some
 * functions implemented could be useful in another class
 * 
 * @author maliel
 * 
 */
public class Car
{
    /**
     * Car position
     */
    private Position position;

    /**
     * Car type (USERCAR/BOTCAR)
     */
    // TODO (fix) consider using a boolean instead of AreaContent
    private AreaContent kindOfCar;

    /**
     * State car value (DEAD/ALIVE)
     */
    private boolean isAlive;

    /**
     * Constructor provides to create an user or a bot car
     * 
     * @param kindOfCar
     *            kind of car (user/bot), if empty no operations
     */
    public Car(AreaContent kindOfCar)
    {
        switch (kindOfCar)
        {
        case USER_CAR:
            this.isAlive = true;
            this.position = new Position(Area.SIZE_WIDTH / 2, Area.SIZE_HEIGHT - 1);
            this.kindOfCar = AreaContent.USER_CAR;
            break;
        case BOT_CAR:
            int max = Area.SIZE_WIDTH;
            int min = 0;
            int randomWidth;
            randomWidth = min + (int) (Math.random() * max);
            this.isAlive = true;
            this.position = new Position(randomWidth, 0);
            this.kindOfCar = AreaContent.BOT_CAR;
            break;
        default:
            break;
        }
    }

    /**
     * this function provides to get the current position of a car
     * 
     * @return car current position (x,y)
     */
    public Position getPosition()
    {
        return this.position;
    }

    /**
     * this function provides to get the current state of a car
     * 
     * @return car state
     */
    public boolean isAlive()
    {
        return this.isAlive;
    }

    /**
     * this function provides to get the kind of a car
     * 
     * @return car type
     */
    public AreaContent getKind()
    {
        return this.kindOfCar;
    }

    /**
     * Destroy a car (ALIVE to DEAD)
     */
    public void destroyCar()
    {
        this.isAlive = false;
    }

    /**
     * Move user car according to the direction - If LEFT : column index - 1 -
     * If FIXED: no change - If RIGHT: column index + 1
     * 
     * @param d
     *            direction to apply
     * @return new position given by translateTo
     */
    public Position moveCar(Direction d)
    {
        return this.position.translateTo(d);
    }

}
