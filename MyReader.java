package mylabs.mylab6;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class MyReader extends FilterReader {
    private int key;

    public MyReader(Reader in, int key) {
        super(in);
        this.key = key;
    }

    @Override
    public int read() throws IOException {
        int ret = in.read();
        return ret == -1 ? -1 : ret - key;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        int ret = in.read(cbuf, off, len);
        for (int i = 0; i < ret; i++) {
            cbuf[i + off] -= key;
        }
        return ret;
    }
}
