package com.synisys.utils;

import com.synisys.interfaces.FileSystemReceiver;
import com.synisys.models.UnixFileSystemReceiver;
import com.synisys.models.WindowsFileSystemReceiver;

public class FileSystemReceiverUtil {
	 public static FileSystemReceiver getUnderlyingFileSystem(){
         String osName = System.getProperty("os.name");
         System.out.println("Underlying OS is:"+osName);
         if(osName.contains("Windows")){
             return new WindowsFileSystemReceiver();
         }else{
             return new UnixFileSystemReceiver();
         }
    }
}
