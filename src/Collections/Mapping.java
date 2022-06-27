package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapping {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();


        hashMap.put(1,"elif");
        hashMap.put(2,"haydar");
        hashMap.put(3,"muharrem");
        System.out.println("Map : " + hashMap);
        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Values : " + hashMap.values());
        System.out.println("Entries : " + hashMap.entrySet());
        System.out.println("Removed value : " + hashMap.remove(2));
        System.out.println("Map : " + hashMap);
        System.out.println("------------------------------");
        treeMap.put(1,"toyota");
        treeMap.put(2,"bmw");
        treeMap.put(3,"mercedes");
        treeMap.put(4,"tofas");
        System.out.println("Tree map : " + treeMap);
        treeMap.replace(1,"mazda");
        treeMap.replace(2,"nissan");
        System.out.println("New tree map : " + treeMap);
        System.out.println("Removed value : " + treeMap.remove(1));
        System.out.println(treeMap);
        System.out.println("------------------------------");
        linkedHashMap.put(1,"hello");
        linkedHashMap.put(2,"hi");
        linkedHashMap.put(3,"adios");
        System.out.println(linkedHashMap);
        LinkedHashMap<Integer, String> linkedHM = new LinkedHashMap<>(linkedHashMap);
        linkedHM.put(4,"world");
        System.out.println(linkedHM);
        System.out.println(linkedHashMap.putIfAbsent(4,"merhaba"));
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.putIfAbsent(5,"merhaba"));
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(2));


    }
}
