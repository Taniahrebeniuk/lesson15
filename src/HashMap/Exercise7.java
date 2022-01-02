package HashMap;

import java.util.HashMap;

public class Exercise7 {
    public static void main(String[] args) {
        HashMap <String, Integer> hash_map =  new HashMap <String, Integer>();
        hash_map.put("Red", 1);
        hash_map.put("Green", 2);
        hash_map.put("Black", 3);

        System.out.println("the Original map: " + hash_map);
        System.out.println("1. Is the key 'Green' exists?");
        if (hash_map.containsKey("Green")) {

            System.out.println("yes - " + hash_map.get("Green"));
        } else {
            System.out.println("no!");
        }

        System.out.println("Is key 'Orange' exists?");
        if (hash_map.containsKey("Orange")) {
            System.out.println("yes -" + hash_map.get("Orange"));
        } else {
            System.out.println("no!");
        }

    }
}
