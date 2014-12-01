package com.synisys.proxy;

public class ServiceProxy implements Service {

	private boolean isAutenticatedUser;
	private Service executor;

	public ServiceProxy(String autenticationId) {
		if ("H9wenm6".equals(autenticationId))
			isAutenticatedUser = true;
		executor = new ServiceImpl();
	}

	public void sendRequest(String cmd) throws Exception {
		if (isAutenticatedUser) {
			executor.sendRequest(cmd);
		} else {
			throw new Exception(
					"Request is not allowed for non autenticated users.");
		}
	}

}