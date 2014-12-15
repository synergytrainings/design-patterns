package demo;

import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;

import com.synisys.trainings.designPatterns.command.api.Command;
import com.synisys.trainings.designPatterns.command.api.Options;
import com.synisys.trainings.designPatterns.command.impl.ChangeOptionsCommand;
import com.synisys.trainings.designPatterns.command.impl.Dialog;
import com.synisys.trainings.designPatterns.command.impl.OptionsImpl;
import com.synisys.trainings.designPatterns.command.impl.SaveCommand;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SaveCommand saveCommand = new SaveCommand();
		Dialog savediDialog = new Dialog("Save Dialog", saveCommand);
		savediDialog.clickOk();
		
		ChangeOptionsCommand changeOptionsCommand = new ChangeOptionsCommand();
		Dialog optionsDialog = new Dialog("Options", changeOptionsCommand);
		
		Options options = new OptionsImpl();
		options.setHideEmptyRows(true);
		options.setHideUnspecifiedRows(false);
		changeOptionsCommand.setOptions(options);
		
		optionsDialog.clickCancel();
		

	}

}
