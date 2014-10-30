package com.synisys.training;

public class CarFactory extends AbstractFactory{

	@Override
	Plane getPlane(PlaneFirm planeFirm) {
				return null;
	}

	@Override
	Car getCar(CarFirm carFirm) {
		if(carFirm == null)
			return null;
		switch (carFirm) {
			case MERCEDES:
				return new Mercedes();
			case BMW:
				return new BMW();
			case TOYOTA:
				return new Toyota();
		}
		return null;
	}
}
