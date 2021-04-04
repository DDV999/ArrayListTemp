import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ArrayListTemp2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);


        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        int maxString = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxString) {
                maxString = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()==maxString)System.out.println("Самое длинное слово под индексом " + i + " и равно = " + list.get(i) + ". Длинна слова равна = " + maxString);
        }
    }
}
