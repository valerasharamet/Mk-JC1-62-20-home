package strings.additional;

public class EasySearchEngine implements ISearchEngine {
    private int count;
    private int index = 1;
    private int index2 = 0;
    private boolean rip = false;

    @Override
    public long search(String text, String word) {

        while (index != -1) {
            index = text.indexOf(word, index2);
            if (index >= 0 && index <= text.length()) {
                int b = text.codePointAt(index - 1);
                int a = text.codePointAt(index + 1);
                if (false == b >= 1040 && b < 1103) {
                    if (false == a >= 1040 && a < 1103) {

                        count++;
                    }
                }
                //if (false ==((b >= 1040 && b < 1103 && b == 1025) && (a >= 1040 && a < 1103 && a == 1025))) {

                //     count++;
                //}
                index2 = index;
                index2++;
            }

        }
        System.out.println(count);
        return count;
    }
}