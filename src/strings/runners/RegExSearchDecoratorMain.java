package strings.runners;

import strings.additional.EasySearchEngine;
import strings.additional.RegExSearch;
import strings.additional.RegExSearchDecorator;
import strings.util.GetText;

public class RegExSearchDecoratorMain {
    public static void main(String[] args) {
        String content =null;
        content = new GetText().getString(content);
        RegExSearchDecorator searchDecorator = new RegExSearchDecorator(new RegExSearch());
        searchDecorator.search(content,"война");


    }
}
