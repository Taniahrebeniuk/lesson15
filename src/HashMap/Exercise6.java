package HashMap;

import java.util.HashMap;

public class Exercise6 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");

        System.out.println("The Original map: " + hash_map);
        HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
        new_hash_map = (HashMap) hash_map.clone();
        System.out.println("Cloned masp: " + new_hash_map);
    }
}
