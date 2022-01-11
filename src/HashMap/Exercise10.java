package HashMap;
import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1,"Red");
        hash_map.put(2, "Blue");
        hash_map.put(3, "Pink");

        String value = (String)hash_map.get(3);
        System.out.println("Value for key 3 is: " + value);

    }
}
