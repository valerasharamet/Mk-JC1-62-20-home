package strings.additional;

public class EasySearchEngine implements ISearchEngine {
    private int count;
    private int index = 0;
    private int index2 =0;

    @Override
    public long search(String text, String word) {

        while (index != -1) {
            index = text.indexOf(" " + word + " ", index2);
            if(index >= 0) {
                index2 = index;
                index2++;
                count++;
            }


        }
        System.out.println(count);
        return count;
    }
}