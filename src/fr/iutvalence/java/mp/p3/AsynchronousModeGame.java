package fr.iutvalence.java.mp.p3;

/**
 * This class represents a round of the game.
 * 
 * @author maliel 
 */
public class AsynchronousModeGame implements Movable, Scrollable, Playable
{
    /**
     * Current display
     */
    private final Display display;

    /**
     * The current area for this round.
     */
    private final Area area;

    /**
     * Score for this round
     */
    private final Score score;

    /**
     * Test boolean to know if the party should be stopped or not
     */
    private boolean isAlive;

    /**
     * Constructor for a new game with userName.The result is a game with an
     * user name chosen by the player, a score equals to 0, and a default number
     * of lives.
     * 
     * @param userName
     *            userName chosen by the user
     * @param display
     *            display type (Ascii/Graphic)
     */
    public AsynchronousModeGame(String userName, Display display)
    {
        this.display = display;
        this.area = new Area();
        this.score = new Score(userName);
    }

    /**
     * This function provides to move the user car (created in the area
     * constructor), set EMPTY value in old car position and USER_CAR in the new
     * 
     * @param direction
     *            direction
     * @return true if no collision, else false
     */
    @Override
    public boolean move(Direction direction)
    {

        if (!(this.area.getCar().getPosition().getX() + direction.getHorizontalShiftValue() >= 0 && this.area.getCar()
                .getPosition().getX()
                + direction.getHorizontalShiftValue() <= Area.SIZE_WIDTH - 1))
            return true;

        if (!(this.area.getContentAt(new Position(this.area.getCar().getPosition().getX()
                + direction.getHorizontalShiftValue(), 0)) == AreaContent.EMPTY))
            return false;

        this.area.changeContentAt(this.area.getCar().getPosition(), AreaContent.EMPTY);
        this.area.getCar().moveCar(direction);
        this.area.changeContentAt(this.area.getCar().getPosition(), AreaContent.USER_CAR);
        return true;

    }

    /**
     * This function provides to scroll the road Line + 1 <-- line
     * 
     * @return boolean if collision return false, else true
     */
    @Override
    public boolean scroll()
    {
        this.isAlive = !this.area.checkUserCarCollision();

        if (this.isAlive)
        {
            int lineNumber = Area.SIZE_HEIGHT - 1;
            Car a = new Car(false);
            this.area.changeContentAt(a.getPosition(), AreaContent.BOT_CAR);
            for (int columnNumber = 0; columnNumber < Area.SIZE_WIDTH; columnNumber++)
            {
                if (this.area.getContentAt(new Position(columnNumber, lineNumber)) == AreaContent.BOT_CAR)
                    this.area.changeContentAt(new Position(columnNumber, lineNumber), AreaContent.EMPTY);
            }
            lineNumber--;
            for (; lineNumber >= 0; lineNumber--)
            {
                this.area.scrollOneLine(lineNumber);
            }
        }
        return this.isAlive;
    }

    
    public Score getScore()
    {
        return this.score;      
    }
    /**
     * This function will provide to start a game, for now just display the road
     * with the standard output
     */
    @Override
    public void play()
    {
        this.isAlive = true;
        // Main loop
        while (this.isAlive)
        {
            // Road display
            this.display.displayArea(this.area.getRoad());
        }
        // Score display
        this.display.displayScore(this.score.getScore());
    }
}
