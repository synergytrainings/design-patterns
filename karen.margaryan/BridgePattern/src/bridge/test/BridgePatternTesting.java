package bridge.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bridge.postoffice.PostOffice;
import bridge.transportation.AirTransportation;
import bridge.transportation.WaggonTransportation;

public class BridgePatternTesting {

	PostOffice postOffice = null;

	@Before
	public void init() {
		postOffice = new PostOffice();
	}

	@Test
	public void testCommunalFees() {
		postOffice.payCommunalFees("apt 123, str Shinararner, Yerevan",
				"Electrocity", 10000);
	}

	/**
	 * I set after annotation here just to show that to pay communal fees can be
	 * proceeded without any transportation object set
	 */
	@After
	public void testAirTransportation() {
		postOffice.setTransportation(new AirTransportation());
		postOffice.sendPackage("address 1", "address 2");
	}
	@After
	public void testWaggonTransportation() {
		postOffice.setTransportation(new WaggonTransportation());
		postOffice.sendPackage("country 1", "country 2");
	}

}
