//import java.util.*;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(1, "Vishal Dadlani");
        hm.put(2, "Satyam Computers");
        hm.put(3, "Elon Musk");
        hm.put(4, "Larry Page");
        hm.put(5, "Sundar Pichai");

        String name = hm.get(3);
        System.out.println(name);
    }
}
