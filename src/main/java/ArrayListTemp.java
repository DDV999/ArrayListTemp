import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ArrayListTemp {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        for (int i =0;i<5;i++){
            String s = reader.readLine();
            list.add(s);
        }
        System.out.println("Размер списка = "+list.size());

        for(int i = 0;i<list.size();i++){
            int j = list.size()-i-1;
            System.out.println(list.get(j));
        }
    }
}