package com.armen.mkrtchyan.abstractfactory;

import java.io.*;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public final class Utils {

    private Utils() {
    }

    public static byte[] serializeObject(Object toSerialize) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(toSerialize);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static Object deSerializeObject(InputStream stream) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(stream)) {
            return objectInputStream.readObject();
        }
    }
}
