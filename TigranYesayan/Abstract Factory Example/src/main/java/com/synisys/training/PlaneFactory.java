package com.synisys.training;

public class PlaneFactory extends AbstractFactory{

	@Override
	Plane getPlane(PlaneFirm planeFirm) {
		if(planeFirm == null)
			return null;
		switch (planeFirm) {
			case AIRBUS:
				return new Airbus();
			case LUFTHANSA:
				return new Lufthansa();
		}
		return null;
	}

	@Override
	Car getCar(CarFirm carFirm) {
		return null;
	}

}
