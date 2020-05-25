package mylabs.mylab6;

import java.io.IOException;
import java.util.Scanner;

public class MyLab6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string to encode: ");
        String line = scanner.nextLine();
        System.out.print("enter key (e.g. 3): ");
        int key = Integer.parseInt(scanner.nextLine());
        String encoded = MyEncodingUtils.encode(line, key);
        System.out.println("encoded = " + encoded);
        String decoded = MyEncodingUtils.decode(encoded, key);
        System.out.println("decoded = " + decoded);
    }
}
