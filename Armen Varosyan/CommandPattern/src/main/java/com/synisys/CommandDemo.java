package com.synisys;

import com.synisys.interfaces.FileSystemReceiver;
import com.synisys.models.CloseFileCommand;
import com.synisys.models.FileInvoker;
import com.synisys.models.OpenFileCommand;
import com.synisys.models.WriteFileCommand;
import com.synisys.utils.FileSystemReceiverUtil;

public class CommandDemo {
	public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
         
        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
         
        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);
         
        //perform action on invoker object
        file.execute();
         
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();
         
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
