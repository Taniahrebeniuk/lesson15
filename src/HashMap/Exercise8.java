package HashMap;
import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        HashMap <Integer, String> hash_map = new HashMap <Integer, String> ();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");

        System.out.println("The Original map: " + hash_map);
        System.out.println("1. Is value \'Green\' exists?");
        if (hash_map.containsKey("Green")) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println("Is value \'Orange\' exists?");
        if (hash_map.containsKey("Orange")) {
            System.out.println("Yes -");
        } else {
            System.out.println("No");
        }
    }
}
