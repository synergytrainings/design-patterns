package TextConvertors;

/**
 * Created by Aram on 11/17/2014.
 */
public interface TextConverter {
    public byte[] convertToBytes(String text);

    public String convertToText(byte[] bytes);

}
