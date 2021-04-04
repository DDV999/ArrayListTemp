import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ArrayListTemp5 {
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
            System.out.println(list.get(i));
        }

        System.out.println("Удаляем и переносим элемент из конца в начало 13 раз!");
        for (int i =0;i<13;i++){
            String s = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,s);
        }

        System.out.println("Размер нового списка = "+list.size());
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}