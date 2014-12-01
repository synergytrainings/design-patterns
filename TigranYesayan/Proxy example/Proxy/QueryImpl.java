package com.synisys.trainings.Proxy;

public class QueryImpl
		implements Query {

	@Override
	public void insert() {
		System.out.println("do insert action");
	}

	@Override
	public void update() {
		System.out.println("do update action");
	}

	@Override
	public void delete() {
		System.out.println("do delete action");
	}

}
