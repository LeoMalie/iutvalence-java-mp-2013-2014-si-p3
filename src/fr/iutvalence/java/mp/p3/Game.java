package fr.iutvalence.java.mp.p3;

/**
 * This class represents a round of the game.
 * @author maliel
 */
public class Game
{
    // TODO (fix) constant name does not comply to naming conventions 
    /**
     * Default score when a round starts.
     */
    public final static int DEFAULTSCORE = 0;

    // TODO (fix) constant name does not comply to naming conventions
    /**
     * Default life number when a round starts.
     */
    public final static int DEFAULTNBLIVES = 3;
    
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
    
    // TODO FIXED rename field (Life -> lives)
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
    	this.playerScore = Game.DEFAULTSCORE;
    	this.nbPlayerLife = Game.DEFAULTNBLIVES;
    	this.player = new Player(userName);
    	this.area = new Area();
    }
    
    /**
     * Check the number of player lives
     * @return true if the player is alive, false if no lives left.
     */
    // TODO (fix) use boolean instead of Boolean
    public Boolean isAlive()
    {
        boolean res = false;
        // TODO (fix) simplify!
    	if (this.nbPlayerLife != 0)
    		res = true;
    	return res;
    }
    
    
}
