package fr.iutvalence.java.mp.p3;

/**
 * This class represents a round of the game.
 * 
 * @author maliel
 */
public class Game
{
    /**
     * Current display
     */
    private Display display;

    /**
     * The current area for this round.
     */
    private Area area;

    /**
     * Current player for this round
     */
    private Player player;

    /**
     * Constructor for a new game with userName.The result is a game with an
     * username chosen by the player, a score equals to 0, and a default number
     * of lives.
     * 
     * @param userName
     *            userName chosen by the user
     */
    public Game(String userName)
    {
        this.display = new AsciiDisplay();
        this.player = new RandomPlayer(userName);
        this.area = new Area();
    }

    /**
     * This function provides to move the user car (created in the area
     * constructor), set EMPTY value in old car position and USER_CAR in the new
     * 
     * @param direction
     *            direction
     * @return true if no collision, else false
     */
    private boolean moveUserCar(Direction direction)
    {

        if (!(this.player.getCar().getPosition().getX() + direction.getValue() >= 0 && this.player.getCar()
                .getPosition().getX()
                + direction.getValue() <= Area.SIZE_WIDTH - 1))
            return true;

        if (!(this.area.getContentAt(new Position(this.player.getCar().getPosition().getX() + direction.getValue(), 0)) == AreaContent.EMPTY))
            return false;

        this.area.changeContentAt(this.player.getCar().getPosition(), AreaContent.EMPTY);
        this.player.getCar().moveCar(direction);
        this.area.changeContentAt(this.player.getCar().getPosition(), AreaContent.USER_CAR);
        return true;

    }

    /**
     * This function provides to scroll the road Line + 1 <-- line
     * 
     * @return boolean if collision return false, else true
     */
    private boolean scrollRoad()
    {
        // TODO (fix) simplify this method.
        // check for collision first.
        // use for loops instead of while
        int lineNumber = Area.SIZE_HEIGHT - 1;
        Car a = new Car(false);
        this.area.changeContentAt(a.getPosition(), AreaContent.BOT_CAR);
        for (int columnNumber = 0; columnNumber < Area.SIZE_WIDTH; columnNumber++)
        {
            if (this.area.getContentAt(new Position(columnNumber, lineNumber)) == AreaContent.BOT_CAR)
                this.area.changeContentAt(new Position(columnNumber, lineNumber), AreaContent.EMPTY);
        }
        lineNumber--;
        
        while (lineNumber >= 0)
        {
            int columnNumber = 0;
            while (columnNumber < Area.SIZE_WIDTH)
            {
                if (this.area.getContentAt(new Position(columnNumber, lineNumber)) == AreaContent.BOT_CAR)
                {
                    switch (this.area.getContentAt(new Position(columnNumber, lineNumber + 1)))
                    {
                    case EMPTY:
                        this.area.changeContentAt(new Position(columnNumber, lineNumber + 1),
                                this.area.getContentAt(new Position(columnNumber, lineNumber)));
                        this.area.changeContentAt(new Position(columnNumber, lineNumber), AreaContent.EMPTY);
                        break;
                    case BOT_CAR:
                        this.area.changeContentAt(new Position(columnNumber, lineNumber), AreaContent.EMPTY);
                        break;
                    case USER_CAR:
                        return false;
                    }
                }
                columnNumber++;
            }
            columnNumber = 0;
            lineNumber--;
        }
        return true;
    }

    /**
     * This function will provide to start a game, for now just display the road
     * with the standard output
     */
    public void play()
    {
        boolean playerAlive = true;
        // Main loop
        while (playerAlive)
        {
            // Road display
            this.display.displayArea(this.area.getRoad());
            if (!this.scrollRoad() || !this.moveUserCar(this.player.getDirection()))
                // Game over !
                playerAlive = false;
            this.player.upScore();
        }
        // Score display
        this.display.displayScore(this.player.getScore());
    }

}
