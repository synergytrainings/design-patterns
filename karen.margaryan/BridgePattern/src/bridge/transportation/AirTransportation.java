package bridge.transportation;

/**
 * Air kind of transportation
 * @author Karen
 *
 */
public class AirTransportation implements Transportation {
	@Override
	public void transport(String from, String to) {
		System.out.printf("Air transportation (from '%s' to '%s')\n", from, to);
	}
}
