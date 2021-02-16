package strings.runners;

import strings.additional.EasySearchEngine;
import strings.additional.RegExSearch;
import strings.util.GetText;

public class RegExSearchMain {
    public static void main(String[] args) {
        String content = null;
        content = new GetText().getString(content);
        RegExSearch regExSearch = new RegExSearch();
        regExSearch.search(content,"война");
    }
}
