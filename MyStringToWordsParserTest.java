package mylabs.mylab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MyStringToWordsParserTest {

    @Test
    void testWordsWithCharactersInAscendingOrder() {
        String str;
        String[] words;

        str = "abc def ghi";
        words = MyStringToWordsParser.wordsWithCharactersInAscendingOrder(str);
        assertArrayEquals(new String[]{"abc", "def", "ghi"}, words);

        str = "abcb def ghih jkl mnon";
        words = MyStringToWordsParser.wordsWithCharactersInAscendingOrder(str);
        assertArrayEquals(new String[]{"def", "jkl"}, words);

        str = "abcb defe ghih jklk mnon";
        words = MyStringToWordsParser.wordsWithCharactersInAscendingOrder(str);
        assertArrayEquals(new String[]{}, words);
    }
}
