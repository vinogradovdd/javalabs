package mylabs.mylab6;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyEncodingUtilsTest {
    @Test
    void testEncode() throws IOException {
        assertEquals("bcde", MyEncodingUtils.encode("abcd", 1));
        assertEquals("cdef", MyEncodingUtils.encode("abcd", 2));
        assertEquals("defg", MyEncodingUtils.encode("abcd", 3));
    }

    @Test
    void testDecode() throws IOException {
        assertEquals("abcd", MyEncodingUtils.decode("bcde", 1));
        assertEquals("abcd", MyEncodingUtils.decode("cdef", 2));
        assertEquals("abcd", MyEncodingUtils.decode("defg", 3));
    }

    @Test
    void testEncodeDecode() throws IOException {
        String s;
        int key = 23;

        s = "hello world";
        assertEquals(s, MyEncodingUtils.decode(MyEncodingUtils.encode(s, key), key));

        s = "";
        assertEquals(s, MyEncodingUtils.decode(MyEncodingUtils.encode(s, key), key));

        s = "abc";
        assertEquals(s, MyEncodingUtils.decode(MyEncodingUtils.encode(s, key), key));
    }
}
