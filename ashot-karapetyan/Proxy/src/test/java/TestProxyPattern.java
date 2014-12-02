
import api.File;
import api.User;
import api.UserType;
import impl.FileFactory;
import impl.UserImpl;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.AccessDeniedException;

import static org.junit.Assert.fail;

public class TestProxyPattern {


    @Test(expected = AccessDeniedException.class)
    public void testFilePermissionsDenied() throws AccessDeniedException {

        String anyPath = "DummyPath";
        User guest = new UserImpl("guest", UserType.GUEST);
        File file = FileFactory.getFile(anyPath, guest);

        file.delete();
        fail("Exception expected.");

    }


    @Test
    public void testFilePermissions() throws AccessDeniedException {
        String anyPath = "test.txt";
        User admin = new UserImpl("Admin", UserType.ADMIN);
        File file = FileFactory.getFile(anyPath, admin);

        file.delete();

    }
}
