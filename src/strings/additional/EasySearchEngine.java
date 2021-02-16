package strings.additional;

public class EasySearchEngine implements ISearchEngine {
    private int count;
    private int index = 1;
    private int index2 = 0;

    public EasySearchEngine () {

    }


    @Override
    public long search(String text, String word) {
        int b;
        int a;
        while (index != -1) {
            index = text.indexOf(word, index2);
            if (index >= 0 && index < text.length()) {
                if(index == 0) {
                    b = 32;
                } else {
                    b = text.codePointAt(index - 1);
                }
                a = text.codePointAt(index + word.length());
                if (b < 1040 || b > 1103 || b == 1025) {
                    if ( a< 1040 || a > 1103 || a == 1025) {

                        count++;
                    }
                }
                index2 = index;
                index2++;
            }

        }
        System.out.println("Количестово повторений слова: " + word + "  " + count  );
        return count;
    }
}