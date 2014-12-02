package impl;


import api.File;
import api.User;
import api.UserType;

public class FileFactory {
	public static File getFile(String path, User user){
		return new SecureFile(user, path);
	}
}
