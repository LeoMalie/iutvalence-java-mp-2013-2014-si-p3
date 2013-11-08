package fr.iutvalence.java.mp.p3;

/**
 * Control interface, provides to get a direction from the player
 * Implemented by KeyboardPlayer (user) and RandomPlayer (bot)
 * @author maliel
 *
 */
public interface Player
{
    /**
     * Get a direction according to the class of player selected
     * @return direction to move to
     */
    public abstract Direction getDirection();
}
