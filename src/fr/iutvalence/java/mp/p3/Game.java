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
    public final static int playerScoreDefault = 0;
    
    /**
     * Default life number when a round starts.
     */
    public final static int nbLifeDefault = 3;
    
    /**
     * Value for a dead player
     */
    public final static int dead = -1;
    
    /**
     * Value for an alive player
     */
    public final static int alive = 1;
    
    /**
     * The current player car for this round.
     */
    protected Car playerCar;  
    
    /**
     * The current area for this round.
     */
    protected Area playerArea;
    
    /**
     * Your current score for this round.
     */
    protected int playerScore;
    
    /**
     * Current player number of life(s) range 0..3.
     */
    protected int nbPlayerLife;
    
    /**
     * Player represents interactions between a round and the player.	
     */
    protected Player player;
    
    /**
     * Current player username.
     */
    protected String playerUsername;
    
    /**
     * Area for this round.
     */
    protected Area playerArea;
    /**
     * Constructor for a new game without parameters.
     */
    public Game()
    {
        this.playerScore = Game.playerScoreDefault;
        this.playerName = "Player1";
        this.nbLife = Game.nbLifeDefault;
    }
    
    public Game(String userName)
    {
    	this.playerScore = Game.playerScoreDefault;
    	this.playerName = userName;
    	this.nbLife = Game.nbLifeDefault;
    }
    
    /**
     * Check the number of player lifes
     * @return true if the player is alive, false if no lifes left.
     */
    protected Boolean isAlive()
    {
    	if (this.nbPlayerLife != 0)
    		return true;
    	return false;
    }
    
    
}
