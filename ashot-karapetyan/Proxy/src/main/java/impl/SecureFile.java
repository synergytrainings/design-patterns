package impl;

import api.File;
import api.User;
import api.UserType;

import java.nio.file.AccessDeniedException;


public final class SecureFile implements File {

    private User user;
    private File file;

    SecureFile(User user, String filePath) {
        this.user = user;
        this.file = new FileImpl(filePath);
    }

    @Override
    public File copy() throws AccessDeniedException {
        if (user.getType() == UserType.ADMIN) {
            return file.copy();
        }else {
            throw new AccessDeniedException("You don't have permission to copy this file!");
        }

    }

    @Override
    public void delete() throws AccessDeniedException {
        if (user.getType() == UserType.ADMIN) {
            file.delete();
        }else {
            throw new AccessDeniedException("You don't have permission to delete this file!");
        }
    }

    @Override
    public void modify() throws AccessDeniedException{
        if (user.getType() == UserType.ADMIN) {
            file.modify();
        }else {
            throw new AccessDeniedException("You don't have permission to modify this file!");
        }
    }

    @Override
    public void open() {
        file.open();
    }

    @Override
    public String getName() {
        return file.getName();
    }
}
