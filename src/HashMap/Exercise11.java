package HashMap;
import java.util.*;

public class Exercise11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map =  new HashMap<Integer, String>();

        hash_map.put(1, "Green");
        hash_map.put(2, "Black");
        hash_map.put(3, "White");

        Set keyset = hash_map.keySet();
        System.out.println("Key set values are: " + keyset);

    }
}
