package fr.iutvalence.java.mp.p3;

/**
 * This class provides interactions for area An area is supposed to be an
 * array[][] :
 * 
 * (0.0)______ | | | | | | |_____|(SIZE_WIDTH,SIZE_HEIGHT)
 * 
 * @author maliel
 * 
 */
public class Area
{
    /**
     * Width size of the array[SIZE_WIDTH][].
     */
    public final static int SIZE_WIDTH = 10;

    /**
     * Height size of the array[][SIZE_HEIGHT].
     */
    public final static int SIZE_HEIGHT = 20;

    /**
     * Playfield
     */
    private AreaContent[][] road;

    /**
     * User car
     */
    private Car userCar;

    /**
     * Default area constructor. Create an array[width][height] of empty
     * squares.
     */
    public Area()
    {
        this.road = new AreaContent[SIZE_WIDTH][SIZE_HEIGHT];
        for (int x = 0; x < SIZE_WIDTH; x++)
        {
            for (int y = 0; y < SIZE_HEIGHT; y++)
                this.road[x][y] = AreaContent.EMPTY;
        }
        // Initialization user car
        this.userCar = new Car(true);
        changeContentAt(this.userCar.getPosition(), AreaContent.USER_CAR);
    }

    /**
     * This function provides to get the road
     * 
     * @return road
     */
    public AreaContent[][] getRoad()
    {
        return this.road;
    } 

    /**
     * This method provides to change the value of a content
     * (EMPTY/USERCAR/BOTCAR)
     * 
     * @param pos
     *            the content position this function use
     * @param newContent
     *            the new content that this function have to put in the square
     */
    public void changeContentAt(Position pos, AreaContent newContent)
    {
        this.road[pos.getX()][pos.getY()] = newContent;
    }

    /**
     * This function provides to get the kind of a square(x,y) in the road
     * according to a position
     * @param pos Position 
     * @return Content in (EMPTY/USER_CAR/BOT_CAR)
     */
    public AreaContent getContentAt(Position pos)
    {
        return this.road[pos.getX()][pos.getY()];
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
     * This function provides to get the user car position and check if a scroll won't cause
     * a collision with a bot car
     * @return true if collision, false else
     */
    public boolean checkUserCarCollision()
    {
        int columnIndex = this.userCar.getPosition().getX();
        if (this.road[columnIndex][SIZE_HEIGHT - 2] != AreaContent.BOT_CAR)
            return false;
        return true;
    }
    
    /**
     * This function provides to scroll one line (used to simplify scrollRoad())
     * @param lineNumber line to scroll
     */
    public void scrollOneLine(int lineNumber)
    {
        for (int columnNumber = 0; columnNumber < Area.SIZE_WIDTH; columnNumber++)
        {
            if (this.getContentAt(new Position(columnNumber, lineNumber)) == AreaContent.BOT_CAR)
            {
                switch (this.getContentAt(new Position(columnNumber, lineNumber + 1)))
                {
                case EMPTY:
                    this.changeContentAt(new Position(columnNumber, lineNumber + 1), AreaContent.BOT_CAR);
                    this.changeContentAt(new Position(columnNumber, lineNumber), AreaContent.EMPTY);
                    break;
                case BOT_CAR:
                    this.changeContentAt(new Position(columnNumber, lineNumber), AreaContent.EMPTY);
                    break;
                default : break;
                }
            }
        }
    }

    /**
     * This function provides to stock the road of the current area in a String
     * square by square. For each end of line, the function adds '\n' to have a
     * correct display of the road if needed to print it
     * 
     * @return String representing each squares of the road
     */
    @Override
    public String toString()
    {
        String testArea = "TEST ZONE DE JEU \n";
        for (int y = 0; y < SIZE_HEIGHT; y++)
        {
            for (int x = 0; x < SIZE_WIDTH; x++)
            {
                switch (this.getContentAt(new Position(x, y)))
                {
                case USER_CAR:
                    testArea = testArea + "V";
                    break;
                case BOT_CAR:
                    testArea = testArea + "T";
                    break;
                case EMPTY:
                    testArea = testArea + ".";
                    break;
                default:
                    testArea = testArea + "?";
                    break;
                }
            }
            testArea = testArea + "\n";
        }
        testArea = testArea + "\0";
        return testArea;
    }
}
