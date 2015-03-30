package main.com.synisys.trainigs.designPatterns.impl;

import main.com.synisys.trainigs.designPatterns.Command;
import main.com.synisys.trainigs.designPatterns.Mediator;

public class Plane implements Command {
	private Mediator mediator;
	private String planeCode;

	public Plane(String planeCode, Mediator mediator) {
		this.mediator = mediator;
		this.planeCode = planeCode;
		mediator.registerPlane(this);
	}

	@Override
	public void land() {
		System.out.println(String.format("%s plane requests to land!", planeCode));
		if (mediator.isLandingPermitted()) {
			System.out.println(String.format("Landing permitted for %s plane...", planeCode));
			mediator.setLandingStatus(true);
		} else {
			System.out.println(String.format("%s plane will wait to land...", planeCode));
		}
	}

	@Override
	public void freeRunway() {
		System.out.println(String.format("Free runway from %s plane...", planeCode));
		mediator.setLandingStatus(false);
	}

}
