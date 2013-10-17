package fr.iutvalence.java.mp.p3;

/**
 * This class represents a round of the game.
 * @author maliel
 */
public class Game
{ 
    /**
     * Default score when a round starts.
     */
    public final static int DEFAULT_SCORE = 0;

    /**
     * Default life number when a round starts.
     */
    public final static int DEFAULT_NB_LIVES = 3;
    
    /**
     * Value for a dead player
     */
    public final static int DEAD = -1;
    
    /**
     * Value for an alive player
     */
    public final static int ALIVE = 1;
    
    /**
     * The current player car for this round.
     */
    private Car playerCar;  

    /**
     * The current area for this round.
     */
    private Area area;
    
    /**
     * Current score for this round.
     */
    private int playerScore;
    
    // TODO (fix) rename field (Life -> lives)
    /**
     * Current player number of lives.
     */
    private int nbPlayerLife;
    
    /**
     * Current player for this round	
     */
    private Player player;
      
    /**
     * Constructor for a new game with userName .The result is a game with an username 
     * chosen by the player, a score equals to 0, and a default number of lives.
     * @param userName userName chosen by the user
     */
    public Game(String userName)
    {
    	this.playerScore = Game.DEFAULT_SCORE;
    	this.nbPlayerLife = Game.DEFAULT_NB_LIVES;
    	this.player = new Player(userName);
    	this.area = new Area();
    }
    
    /**
     * Check the number of player lives
     * @return true if the player is alive, false if no lives left.
     */
    // TODO (fix) this method should be internal (private)
    private boolean isAlive()
    {
    	return (this.nbPlayerLife != 0);
    }
    
    /**
     * This function will provide to start a game, for now just display 
     * the road with the standard output
     */
    public void play()
    {
        Car b = new Car(Square.USER_CAR);
        this.area.changeSquare(b.getPosition(), Square.USER_CAR);
        while(this.isAlive())
        {
            Car a = new Car(Square.BOT_CAR);
            this.area.changeSquare(a.getPosition(), Square.BOT_CAR);
            System.out.println(this.area.toString());
            this.area.scrollRoad();
            //Game.sleep(2);
        }
    }
    
    
}
