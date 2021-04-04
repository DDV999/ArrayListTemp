import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import static java.lang.Integer.MAX_VALUE;

public class ArrayListTemp6 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);


        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        int maxString = 0;
        int indexMax = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxString) {
                maxString = list.get(i).length();
                indexMax = i;
            }
        }

        int minString = MAX_VALUE;
        int indexMin = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minString) {
                minString = list.get(i).length();
                indexMin = i;
            }
        }

        if (indexMax < indexMin) System.out.println("Первым встречается длинное слово = "+list.get(indexMax));
        if (indexMax > indexMin) System.out.println("Первым встречается короткое слово = "+list.get(indexMin));
    }
}
