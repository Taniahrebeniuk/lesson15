package HashMap;
import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        HashMap <Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Blue");

        boolean result = hash_map.isEmpty();
        System.out.println("Is hash map empty: " + result);
        hash_map.clear();
        result = hash_map.isEmpty();

        System.out.println("Is hash map empty: " + result);
    }
}
