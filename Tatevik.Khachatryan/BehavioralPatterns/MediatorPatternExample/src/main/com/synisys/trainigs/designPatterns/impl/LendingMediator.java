package main.com.synisys.trainigs.designPatterns.impl;

import main.com.synisys.trainigs.designPatterns.Mediator;

public class LendingMediator implements Mediator {
	private Plane plane;	
		
	/**
	 * Has "true" value if lending permitted and "false" in other case.
	 */
	private boolean landingPermitted = true;

	@Override
	public void registerPlane(Plane plane) {
		this.plane = plane;
	}

	@Override
	public void setLandingStatus(boolean status) {				
			landingPermitted = !status;		
	}


	@Override
	public boolean isLandingPermitted() {
		return landingPermitted;
	}
	
	public Plane getCurrentPlane() {
		return this.plane;
	}

}
