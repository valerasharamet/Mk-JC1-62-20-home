package strings.additional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class RegExSearch implements ISearchEngine {
    private long count;



    @Override
    public long search(String text, String word) {
        Pattern p = Pattern.compile("[^а-яА-Я]" + word + "[^а-яА-Я]", CASE_INSENSITIVE);

        Matcher m = p.matcher(text);
        while (m.find()){
            count++;
        }
        System.out.println(count);
        return count;
    }
}
