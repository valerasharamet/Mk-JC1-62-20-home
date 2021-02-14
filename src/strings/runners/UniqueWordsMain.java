package strings.runners;

import strings.util.GetText;
import strings.util.UniqueWords;

import java.util.HashSet;

public class UniqueWordsMain {
    public static void main(String[] args) {
        HashSet<String> uniqueWords = new HashSet<>();
        String content = "";
        content = new GetText().getString(content);
        uniqueWords = new UniqueWords().getUniqueWords(uniqueWords, content);


    }
}
