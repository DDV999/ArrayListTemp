import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import static java.lang.Integer.MAX_VALUE;

public class ArrayListTemp3 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);


        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        int minString = MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minString) {
                minString = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()==minString)System.out.println("Самое короткое слово под индексом " + i + " и равно = " + list.get(i) + ". Длинна слова равна = " + minString);
        }
    }
}
