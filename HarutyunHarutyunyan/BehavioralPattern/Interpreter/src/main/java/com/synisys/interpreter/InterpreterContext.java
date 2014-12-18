package com.synisys.interpreter;

import java.util.ArrayList;

import com.synisys.entity.AutoWebService;
import com.synisys.entity.Car;

public class InterpreterContext {
	private AutoWebService webService;

	public InterpreterContext(String sitePath) {
		webService = new AutoWebService(sitePath);
	}

	public ArrayList<Car> getAllCars() {
		return webService.getAllCars();
	}

}
