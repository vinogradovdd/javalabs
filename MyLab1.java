package mylabs.mylab1;

import java.util.Arrays;
import java.util.Scanner;

public class MyLab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter words: ");
        String line = scanner.nextLine();
        String[] result = MyStringToWordsParser.wordsWithCharactersInAscendingOrder(line);
        System.out.println("result: " + Arrays.toString(result));
    }
}
