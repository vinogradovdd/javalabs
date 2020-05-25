package mylabs.mylab6;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

public class MyEncodingUtils {
    public static String encode(String s, int key) throws IOException {
        StringWriter stringWriter = new StringWriter(s.length());
        MyWriter myWriter = new MyWriter(stringWriter, key);
        myWriter.write(s);
        return stringWriter.toString();
    }

    public static String decode(String s, int key) throws IOException {
        Reader stringReader = new StringReader(s);
        Reader myReader = new MyReader(stringReader, key);
        char[] buf = new char[s.length()];
        //noinspection ResultOfMethodCallIgnored
        myReader.read(buf);
        return new String(buf);
    }
}
