package Collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class EnumMapping {
    enum Size{
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }

    public static void main(String[] args) {
        EnumMap<Size,Integer>enumMap = new EnumMap<>(Size.class);
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        NavigableMap<Integer,String> navigableMap = new TreeMap<>();    //same as others i think :) of course is not but im so bored.
        ConcurrentMap<Integer,String> concurrentMap = new ConcurrentHashMap<>();
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>(8, 0.5f); // default capacity and loadFactor are 16, 0.75.

        enumMap.put(Size.SMALL, 15);
        enumMap.put(Size.SMALL, 12);
        enumMap.put(Size.MEDIUM, 25);
        enumMap.put(Size.LARGE,35);
        System.out.println("EnumMap : " + enumMap);
        System.out.println("Large size : " + enumMap.get(Size.LARGE));
        System.out.println("Removed value : " + enumMap.remove(Size.SMALL));
        System.out.println("EnumMap : " + enumMap);
        System.out.println("-------------------------------");
        sortedMap.put(1,"Murat");
        sortedMap.put(2,"Eren");
        sortedMap.put(3,"Osman");
        System.out.println("Sorted map: " + sortedMap);
        System.out.println("First value : " + sortedMap.firstKey());
        System.out.println("Last value : " + sortedMap.lastKey());
        System.out.println("-------------------------------");
        concurrentMap.put(1,"Eren");
        concurrentMap.put(2,"Serpil");
        concurrentMap.put(3,"Hasan");
        concurrentMap.put(4,"Usain");
        System.out.println("Concurrent map : " + concurrentMap);
        System.out.println("--------------------------------");
        concurrentHashMap.put(1,"hoodie");
        concurrentHashMap.put(2,"sweatshirt");
        concurrentHashMap.put(3,"t-shirt");
        concurrentHashMap.put(4,"hat");
        concurrentHashMap.forEach(8,(k,v) -> System.out.println("key: " + k + "value " + v));



    }
}
