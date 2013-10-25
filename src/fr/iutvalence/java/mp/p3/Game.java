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
    private Affichage affichage;
    
    /**
     * The current area for this round.
     */
    private Area area;

    /**
     * Current player for this round
     */
    private Player player;

    /**
     * Constructor for a new game with userName .The result is a game with an
     * username chosen by the player, a score equals to 0, and a default number
     * of lives.
     * 
     * @param userName
     *            userName chosen by the user
     */
    public Game(String userName)
    {
        this.affichage = new Affichage();
        this.player = new Player(userName);
        this.area = new Area();
    }

    // TODO FIXED this method (internal) should be private
    /**
     * This function provides to move the user car (created in the area
     * constructor), set EMPTY value in old car position and USER_CAR in the new
     * 
     * @param direction direction
     * @return true if no collision, else false
     */
    private boolean moveUserCar(Direction direction)
    {

        if (!(this.player.getCar().getPosition().getX() + direction.getValue() >= 0
                && this.player.getCar().getPosition().getX() + direction.getValue() <= Area.SIZE_WIDTH - 1))
            return true;
        
        if (!(this.area.getContent(this.player.getCar().getPosition().getX() + direction.getValue(), 0) == AreaContent.EMPTY))
            return false;
        
        this.area.changeContent(this.player.getCar().getPosition(), AreaContent.EMPTY);
        this.player.getCar().moveCar(direction);
        this.area.changeContent(this.player.getCar().getPosition(), AreaContent.USER_CAR);
        return true;
        
    }

    /**
     * This function provides to scroll the road Line + 1 <-- line
     * 
     * @return boolean if collision return false, else true
     */
    // TODO FIXED this method (internal) should be private
    private boolean scrollRoad()
    {
        int indiceLigne = Area.SIZE_HEIGHT - 1;
        int indiceColonne = 0;
        Car a = new Car(false);
        this.area.changeContent(a.getPosition(), AreaContent.BOT_CAR);
        for (int i = 0; i < Area.SIZE_WIDTH; i++)
        {
            if (this.area.getContent(i, indiceLigne) == AreaContent.BOT_CAR)
                this.area.changeContent(new Position(i, indiceLigne), AreaContent.EMPTY);
        }
        indiceLigne--;
        while (indiceLigne >= 0)
        {
            while (indiceColonne < Area.SIZE_WIDTH)
            {
                if (this.area.getContent(indiceColonne, indiceLigne) == AreaContent.BOT_CAR)
                {
                    switch (this.area.getContent(indiceColonne, indiceLigne + 1))
                    {
                    case EMPTY:
                        this.area.changeContent(new Position(indiceColonne, indiceLigne + 1),
                                this.area.getContent(indiceColonne, indiceLigne));
                        this.area.changeContent(new Position(indiceColonne, indiceLigne), AreaContent.EMPTY);
                        break;
                    case BOT_CAR:
                        this.area.changeContent(new Position(indiceColonne, indiceLigne), AreaContent.EMPTY);
                        break;
                    case USER_CAR:
                        return false;
                    }
                }
                indiceColonne++;
            }
            indiceColonne = 0;
            indiceLigne--;
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
            this.affichage.afficherZone(this.area.getRoad());
            if (!this.scrollRoad() || !this.moveUserCar(this.player.getDirection()))
                // Game over !
                playerAlive = false;
            this.player.upScore();
        }
        // Score display
        this.affichage.afficherScore(this.player.getScore());
    }

}
