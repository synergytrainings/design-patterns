package com.synisys.entity;

import java.util.ArrayList;

public class AutoWebService {
	private String sitePath;

	public AutoWebService(String sitePath) {
		this.sitePath = sitePath;
	}

	public ArrayList<Car> getAllCars() {
		// For testing it can be geted from sitePath
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Car("LexusGX470", "2007"));
		carList.add(new Car("ToyotaPrado", "2008"));
		carList.add(new Car("LexusGX470", "2008"));
		carList.add(new Car("LexusGX470", "2006"));
		carList.add(new Car("ToyotaPrado", "2002"));
		carList.add(new Car("LexusGX470", "2008"));
		carList.add(new Car("LexusGX470", "2003"));
		carList.add(new Car("ToyotaPrado", "2010"));

		return carList;
	}

	public String getSitePath() {
		return sitePath;
	}
}
