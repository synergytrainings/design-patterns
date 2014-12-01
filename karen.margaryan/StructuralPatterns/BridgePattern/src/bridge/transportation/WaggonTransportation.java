package bridge.transportation;

/**
 * Waggon kind of transportation
 * @author Karen
 *
 */
public class WaggonTransportation implements Transportation {
	@Override
	public void transport(String from, String to) {
		System.out.printf("Waggon transportation (from '%s' to '%s')\n", from, to);
	}
}
