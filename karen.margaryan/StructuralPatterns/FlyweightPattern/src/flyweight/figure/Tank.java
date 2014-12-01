package flyweight.figure;

/**
 * Concrete figure type implementation
 * @author Karen
 *
 */
public class Tank implements Figure {

	private Object tankGraphicalRepresentation;
	
	@Override
	public void move(int previousX, int previousY, int newX, int newY) {
		System.out.println(
				String.format("MOVE TANK: remove tank from previous position %d/%d", previousX, previousY));
		System.out.println(
				String.format("MOVE TANK: draw tank in new position %d/%d", newX, newY));
	}
	
}
