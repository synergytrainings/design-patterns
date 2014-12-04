package com.synisys;

import com.synisys.interfaces.CommandExecutor;
import com.synisys.models.CommandExecutorImpl;

public class CommandExecutorProxy implements CommandExecutor{
	private CommandExecutor executor ;
	private boolean hasPermission ;
	
	public CommandExecutorProxy(String userName, String password){
		hasPermission = checkPermission(userName, password);
		executor = new CommandExecutorImpl();
	}

	public void executeCommand(String command) throws Exception {
		if(hasPermission){
			executor.executeCommand(command);
		}
		else{
			throw new Exception();
		}
		
	}
	
	private boolean checkPermission(String userName, String password){
		//some implemanatation 
		return true;
	}

}
