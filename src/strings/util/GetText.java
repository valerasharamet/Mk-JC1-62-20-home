package strings.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GetText  {
    private String filePath = "C:\\home\\dev\\Mk-JC1-62-20-home\\src\\strings\\resources\\Война и мир_книга.txt";
    private String string = null;


    public String getString(String string) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filePath))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                string = string + str;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Строка заполнена");
        return string;
    }
}
