package com.synisys;

import com.synisys.interfaces.CommandExecutor;
import com.synisys.models.CommandExecutorFactory;

public class ProxyDemo {
	public static void main(String[] args ){
		CommandExecutor executor =new  CommandExecutorFactory().getCommandExecutor("usernamne", "password");
		try {
			executor.executeCommand("command");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
