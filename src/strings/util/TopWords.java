package strings.util;


import java.util.*;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TopWords {
    private Map<String,Integer> words = new HashMap<String,Integer>();

    public void setValue (String word) {
        if (words.containsKey(word)) {
            words.replace(word, words.get(word) + 1);
        } else {
            words.put(word, 1);
        }
    }

    public Map<String,Integer> getMap (String string) {
        Pattern p = Pattern.compile("[^а-яА-Я\\s]|\n");
        Matcher m = p.matcher(string);
        string = m.replaceAll("");
        String[] str = string.split(" +");
        for( String word:str) {
            setValue(word);
        }
        System.out.println("Размер Map " + words.size());
        return words;
    }

    public void getTopWord (int top) {
        List<Map.Entry<String,Integer>> topList = new ArrayList<>(words.entrySet());
        Collections.sort(topList, new Comparator<Map.Entry<String, Integer>>()
        {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
          System.out.println("Top слов:");
         for (int i =0; i <= top -1; i++) {
             System.out.println(i+1 + "  Место  " + topList.get(i) +  " раз");

        }
    }
}
