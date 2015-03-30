package main.com.synisys.trainigs.designPatterns;

import main.com.synisys.trainigs.designPatterns.impl.Plane;

public interface Mediator {
	void registerPlane(Plane plane);

	boolean isLandingPermitted();

	void setLandingStatus(boolean status);
}
