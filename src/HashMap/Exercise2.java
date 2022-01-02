package HashMap;

import java.util.HashMap;

public class Exercise2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Green");
        hash_map.put(2, "Red");
        hash_map.put(3, "Yellow");
        hash_map.put(4, "Orange");
        hash_map.put(5, "Blue");
        System.out.println("Size of the hash map: "+ hash_map.size());
    }
}
