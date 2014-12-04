package com.synisys.models;

import com.synisys.CommandExecutorProxy;
import com.synisys.interfaces.CommandExecutor;

public class CommandExecutorFactory {
	public CommandExecutor getCommandExecutor(String userName, String password){
		return new CommandExecutorProxy(userName, password);
	}
}
