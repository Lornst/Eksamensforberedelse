import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2){
        return o1.length() - o2.length();
    }
}
public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("B");
        liste.add("F");
        liste.add("G");
        liste.add("H");

        //Collections.sort(liste, new MyComparator());

        liste.sort(null);
        System.out.println(liste);
    }
}
