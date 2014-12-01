package flyweight.figure;

/**
 * Figure actions in the game
 * @author Karen
 *
 */
public interface Figure {
	public void move(int previousX, int previousY, int newX, int newY);
}
