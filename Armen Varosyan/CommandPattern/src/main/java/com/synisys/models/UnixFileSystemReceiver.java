package com.synisys.models;

import com.synisys.interfaces.FileSystemReceiver;

public class UnixFileSystemReceiver implements FileSystemReceiver {

    public void openFile() {
        System.out.println("Opening file in unix OS");
    }
 
    public void writeFile() {
        System.out.println("Writing file in unix OS");
    }
 
    public void closeFile() {
        System.out.println("Closing file in unix OS");
    }
}
