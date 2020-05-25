package mylabs.mylab5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MyLab5 {
    public static void main(String[] args) throws IOException {
        Path lipsum = Path.of("lipsum.txt");
        List<String> lines = MySortedLineReader.getLinesSortedByLength(lipsum);
        System.out.println("lines sorted by length:");
        lines.forEach(System.out::println);
        Files.write(Path.of("result.txt"), lines);
    }
}
