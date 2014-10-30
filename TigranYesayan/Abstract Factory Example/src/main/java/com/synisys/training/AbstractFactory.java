package com.synisys.training;

public abstract class AbstractFactory {
	abstract Plane getPlane(PlaneFirm planeFirm);
	abstract Car getCar(CarFirm carFirm);
}
