package strings.runners;

import strings.additional.RegExSearch;
import strings.additional.SearchEnginePunctuationNormalizer;
import strings.util.GetText;

public class SearchEnginePunctuationNormalizerMain {
    public static void main(String[] args) {
        String content = null;
        content = new GetText().getString(content);
        SearchEnginePunctuationNormalizer serch = new SearchEnginePunctuationNormalizer(new RegExSearch());
        serch.search(content,"война");

    }
}
