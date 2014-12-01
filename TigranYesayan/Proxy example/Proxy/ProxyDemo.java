package com.synisys.trainings.Proxy;

public class ProxyDemo {
	public static void main(String[] args) {
		User user = new User();
		user.setName("Tigran");
		user.setCanInsert(true);
		user.setCanUpdate(false);
		user.setCanDelete(true);
		QueryProxy proxy = new QueryProxy(user);
		proxy.insert();
		proxy.update();
		proxy.delete();
	}
}
