package impl;

import api.File;
import api.User;

public class FileImpl implements File{


    private String fileName;

    FileImpl(String filePath) {
        this.fileName = filePath;
    }

    @Override
    public File copy() {
       return new FileImpl(this.fileName);
    }

    @Override
    public void delete() {
        System.out.println("File is being deleted...");    }

    @Override
    public void modify() {
        System.out.println("File is being modified...");
    }

    @Override
    public void open() {
        System.out.println("File is being opened...");
    }

    @Override
    public String getName() {
        return this.fileName;
    }
}
