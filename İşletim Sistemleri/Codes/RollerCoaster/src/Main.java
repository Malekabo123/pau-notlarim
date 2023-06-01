import java.util.HashMap;
import java.util.*;
import java.lang.*;

public class Main {
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }


    public static void main(String[] args) {

        int indeces[] = {1,2,50,77,106,128,151,177,187,208,
                221,235,249,255,262,267,282,293,305,312,322,332,
                342,350,359,367,377,385,396,404,411,415,418,428,
                434,440,446,453,458,467,477,483,489,496,499,502,
                507,511,515,518,520,523,526,528,531,534,537,542,
                545,549,551,553,554,556,558,560};

        HashMap<Integer, Integer> lenghts = new HashMap<Integer, Integer>();

        for (int i = 1; i < indeces.length; i++) {
            lenghts.put(i-1,(indeces[i]-indeces[i-1]));
        }

        Map<Integer, Integer> sorted = sortByValue(lenghts);

        for (Map.Entry<Integer, Integer> en : sorted.entrySet()) {
            System.out.println(en.getKey() +
                    ": " + en.getValue());
        }

    }
}