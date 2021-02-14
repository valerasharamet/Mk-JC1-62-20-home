package strings.runners;

import strings.util.GetText;
import strings.util.TopWords;

import java.util.HashMap;
import java.util.Map;

public class TopWordsMain {
    public static void main(String[] args) {
        String content = "";
        TopWords topWords = new TopWords();
        content = new GetText().getString(content);
        Map<String,Integer> words = topWords.getMap(content);
        topWords.getTopWord(2);
    }
}
