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
    public final static int playerScoreDefault = 0;

    // TODO (fix) constant name does not comply to naming conventions
    /**
     * Default life number when a round starts.
     */
    public final static int nbLifeDefault = 3;
    
    // TODO (fix) constant name does not comply to naming conventions
    /**
     * Value for a dead player
     */
    public final static int dead = -1;
    
    // TODO (fix) constant name does not comply to naming conventions
    /**
     * Value for an alive player
     */
    public final static int alive = 1;
    
    // TODO (think about it) justify the use of  protected
    /**
     * The current player car for this round.
     */
    protected Car playerCar;  

    // TODO (think about it) justify the use of  protected
    // TODO (fix) rename field (it is not only related to the player)
    /**
     * The current area for this round.
     */
    protected Area playerArea;
    
    // TODO (think about it) justify the use of  protected
    // TODO (fix) fix comment (your ...)
    /**
     * Your current score for this round.
     */
    protected int playerScore;
    
    // TODO (fix) fix comment (do not use hard-coded values)
    // TODO (think about it) justify the use of  protected
    // TODO (fix) rename field (Life -> lives)
    /**
     * Current player number of life(s) range 0..3.
     */
    protected int nbPlayerLife;
    
    // TODO (think about it) justify the use of  protected
    // TODO (fix) simplify comment
    /**
     * Player represents interactions between a round and the player.	
     */
    protected Player player;
    
    // TODO (think about it) should it be really contained in this class?
    /**
     * Current player username.
     */
    protected String playerUsername;
    
    // TODO (fix) detail comment (how is the game once created?)
    /**
     * Constructor for a new game without parameters.
     */
    public Game()
    {
        // TODO (think about it) are all fields initialized?
        this.playerScore = Game.playerScoreDefault;
        this.playerUsername = "Player1";
        this.nbPlayerLife = Game.nbLifeDefault;
    }
    
    // TODO (fix) detail comment (how is the game once created?)
    /**
     * Constructor for a new game with userName
     * @param userName userName chosen by the user
     */
    public Game(String userName)
    {
    	this.playerScore = Game.playerScoreDefault;
    	this.playerUsername = userName;
    	this.nbPlayerLife = Game.nbLifeDefault;
    }
    
    /**
     * Check the number of player lifes
     * @return true if the player is alive, false if no lifes left.
     */
    // TODO (fix) use boolean instead of boolean
    protected Boolean isAlive()
    {
        // TODO (fix) simplify!
    	if (this.nbPlayerLife != 0)
    		return true;
    	return false;
    }
    
    
}
