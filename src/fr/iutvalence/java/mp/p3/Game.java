package fr.iutvalence.java.mp.p3;

/**
 * This class represents a round of the game.
 * @author maliel
 */
public class Game
{
    // TODO FIXED constant name does not comply to naming conventions 
    /**
     * Default score when a round starts.
     */
    public final static int DEFAULTSCORE = 0;

    // TODO FIXED constant name does not comply to naming conventions
    /**
     * Default life number when a round starts.
     */
    public final static int DEFAULTNBLIVES = 3;
    
    // TODO FIXED constant name does not comply to naming conventions
    /**
     * Value for a dead player
     */
    public final static int DEAD = -1;
    
    // TODO FIXED constant name does not comply to naming conventions
    /**
     * Value for an alive player
     */
    public final static int ALIVE = 1;
    
    // TODO FIXED (think about it) justify the use of  protected
    /**
     * The current player car for this round.
     */
    private Car playerCar;  

    // TODO FIXED (think about it) justify the use of  protected
    // TODO FIXED rename field (it is not only related to the player)
    /**
     * The current area for this round.
     */
    private Area area;
    
    // TODO FIXED (think about it) justify the use of  protected
    // TODO FIXED fix comment (your ...)
    /**
     * Current score for this round.
     */
    private int playerScore;
    
    // TODO FIXED fix comment (do not use hard-coded values)
    // TODO FIXED (think about it) justify the use of  protected
    // TODO FIXED rename field (Life -> lives)
    /**
     * Current player number of lives.
     */
    private int nbPlayerLife;
    
    // TODO FIXED (think about it) justify the use of  protected
    // TODO FIXED (fix) simplify comment
    /**
     * Current player for this round	
     */
    private Player player;
    
    // TODO FIXED detail comment (how is the game once created?)
    /**
     * Constructor for a new game without parameters. The result is a game with a default 
     * username, a score equals to 0, and a default number of lives.
     */
    public Game()
    {
        // TODO FIXED (think about it) are all fields initialized?
        this.playerScore = Game.DEFAULTSCORE;
        this.nbPlayerLife = Game.DEFAULTNBLIVES;
        this.player = new Player();
        this.area = new Area();
    }
    
    // TODO FIXED detail comment (how is the game once created?)
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
    // TODO FIXED use boolean instead of boolean
    protected Boolean isAlive()
    {
        boolean res = false;
        // TODO FIXED simplify!
    	if (this.nbPlayerLife != 0)
    		res = true;
    	return res;
    }
    
    
}
