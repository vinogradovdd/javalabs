package mylabs.mylab5;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MySortedLineReaderTest {
    @Test
    void testGetLinesSortedByLength() throws IOException {
        List<String> lines = MySortedLineReader.getLinesSortedByLength(Path.of("lipsum.txt"));
        assertEquals(Arrays.asList(
                "In nec urna metus",
                "Duis ut augue dolor",
                "Sed eu efficitur enim",
                "Phasellus ut nibh arcu",
                "Nullam ut lectus tellus",
                "Proin at interdum massa",
                "Donec eget sodales nulla",
                "Vestibulum a tellus ipsum",
                "Nulla sit amet blandit augue",
                "Aenean rhoncus rutrum fringilla",
                "Nam rutrum sit amet est ut euismod",
                "Sed et mattis nisi, et mattis libero",
                "Mauris aliquet ac nisi non fermentum",
                "Nunc faucibus arcu ex, ac porttitor diam venenatis a",
                "Suspendisse tempor nibh eget ligula vulputate posuere",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
                "Interdum et malesuada fames ac ante ipsum primis in faucibus",
                "Interdum et malesuada fames ac ante ipsum primis in faucibus",
                "Morbi felis risus, mollis ac varius non, sollicitudin eget erat",
                "Aliquam posuere ligula vel nisl rhoncus, at dapibus metus imperdiet",
                "Fusce fermentum metus vel lectus feugiat, quis tristique leo sagittis"
        ), lines);
    }
}
