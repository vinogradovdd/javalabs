package mylabs.mylab5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

public class MySortedLineReader {
    public static List<String> getLinesSortedByLength(Path path) throws IOException {
        List<String> stringList = Files.readAllLines(path);
        stringList.sort(Comparator.comparingInt(String::length));
        return stringList;
    }
}
