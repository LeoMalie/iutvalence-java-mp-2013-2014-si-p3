package fr.iutvalence.java.mp.p3;

/**
 * This class represents a round of this game.
 * @author maliel
 *
 */
public class Game
{
    /**
     * Default score when a round starts.
     */
    public final static int playerScoreDefault = 0;
    /**
     * Your current score for this round.
     */
    public int playerScore;
    /**
     * Player's name for this round.
     */
    public char[] playerName;
    /**
     * Area for this round.
     */
    public Area playerArea;
    /**
     * Constructor for a new game without parameters.
     */
    public Game()
    {
        this.playerScore = Game.playerScoreDefault;
        this.playerName = "Player1";
    }
    
}
