package com.synisys.trainings.Proxy;

public class QueryProxy
		implements Query {
	User user;
	QueryImpl query;

	public QueryProxy(User user) {
		this.user = user;
	}

	@Override
	public void insert() {
		if (user.isCanInsert()) {
			query = new QueryImpl();
			query.insert();
		}
		else {
			System.out.println(user.getName() + " You don't have permission for insert");
		}

	}

	@Override
	public void update() {
		if (user.isCanUpdate()) {
			query = new QueryImpl();
			query.update();
		}
		else {
			System.out.println(user.getName() + " You don't have permission for update");
		}

	}

	@Override
	public void delete() {
		if (user.isCanDelete()) {
			query = new QueryImpl();
			query.delete();
		}
		else {
			System.out.println(user.getName() + " You don't have permission for delete");
		}
	}
}
