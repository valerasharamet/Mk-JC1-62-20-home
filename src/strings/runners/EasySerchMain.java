package strings.runners;

import strings.additional.EasySearchEngine;
import strings.util.GetText;

public class EasySerchMain {
    public static void main(String[] args) {
        String content = "";
        content = new GetText().getString(content);
        EasySearchEngine easySearchEngine = new EasySearchEngine();
        easySearchEngine.search(content, "Война");
    }
}
