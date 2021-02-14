package strings.util;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueWords {

    public HashSet<String> getUniqueWords(HashSet<String> uniqueWords, String content) {
        Pattern p = Pattern.compile("[^а-яА-Я\\s]|\n");
        // получение matcher объекта
        Matcher m = p.matcher(content);
        content = m.replaceAll("");
        String[] str = content.split(" +");
        for (String s : str) {
            if (!s.isEmpty())
                uniqueWords.add(s);
        }

        System.out.println("Количество уникальных слов:  " + uniqueWords.size());
        return uniqueWords;
    }
}
