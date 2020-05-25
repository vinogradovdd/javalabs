package mylabs.mylab1;

import java.util.Arrays;

public class MyStringToWordsParser {
    public static String[] wordsWithCharactersInAscendingOrder(String s) {
        String[] words = s.split(" ");
        String[] strings = new String[words.length];
        int validCount = 0;
        for (String word : words) {
            boolean isValid = true;
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) < word.charAt(i - 1)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                strings[validCount++] = word;
            }
        }
        if (validCount < strings.length) {
            strings = Arrays.copyOf(strings, validCount);
        }
        return strings;
    }
}
