package strings.additional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine sercgE;


    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.sercgE = iSearchEngine;
    }
    @Override
    public long search(String text, String word) {
        getSimpleText(text);
        return sercgE.search(text,word);
    }

    public String getSimpleText (String text) {
        Pattern p = Pattern.compile("[^а-яА-Я\\s]|\n");
        Matcher m = p.matcher(text);
        text = m.replaceAll("");
       return text;
    }

}
