package HashMap;
import java.util.*;

public class Exercise12 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map =  new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "White");

        System.out.println("Collection view is: " + hash_map.values());

    }
}
