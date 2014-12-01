package flyweight.figure;

/**
 * Concrete figure type implementation
 * @author Karen
 *
 */
public class Soldier implements Figure {

	private Object soldierGraphicalRepresentation;
	
	@Override
	public void move(int previousX, int previousY, int newX, int newY) {
		System.out.println("MOVE SOLDIER: remove soldier from previous position");
		System.out.println("MOVE SOLDIER: draw soldier in new position");
	}

}
