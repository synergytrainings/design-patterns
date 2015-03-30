package main.com.synisys.trainigs.designPatterns.impl;

import main.com.synisys.trainigs.designPatterns.*;

public class Demo {
	public static void main(String args[]) {
		Mediator mediator = new LendingMediator();
		
		// Share same mediator for all planes
		// Mediator holds runway state for letting planes to land or not.
		Plane plane1 = new Plane("Plane 1", mediator);		
		Plane plane2 = new Plane("Plane 2", mediator);
		Plane plane3 = new Plane("Plane 3", mediator);
		
		plane1.land();
		plane2.land();
		plane3.land();
		plane1.freeRunway();
		plane2.land();
		plane3.land();
		
		/**
		 Result is:
		  	Plane 1 plane requests to land!
			Landing permitted for Plane 1 plane...
			Plane 2 plane requests to land!
			Plane 2 plane will wait to land...
			Plane 3 plane requests to land!
			Plane 3 plane will wait to land...
			Free runway from Plane 1 plane...
			Plane 2 plane requests to land!
			Landing permitted for Plane 2 plane...
			Plane 3 plane requests to land!
			Plane 3 plane will wait to land...
		 */
	}
}
