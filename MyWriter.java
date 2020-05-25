package mylabs.mylab6;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class MyWriter extends FilterWriter {
    private int key;

    public MyWriter(Writer out, int key) {
        super(out);
        this.key = key;
    }

    @Override
    public void write(int c) throws IOException {
        out.write(c + key);
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        for (int i = 0; i < len; i++) {
            cbuf[i + off] += key;
        }
        out.write(cbuf, off, len);
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        char[] cbuf = new char[len];
        str.getChars(off, off + len, cbuf, 0);
        this.write(cbuf, 0, len);
    }
}
