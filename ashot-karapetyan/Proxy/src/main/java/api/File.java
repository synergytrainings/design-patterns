package api;

import java.nio.file.AccessDeniedException;

public interface File {

    File copy() throws AccessDeniedException;

    void delete() throws AccessDeniedException;

    void modify() throws AccessDeniedException;

    void open();

    String getName();
}
