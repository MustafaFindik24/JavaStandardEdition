package Collections;

import java.util.*;

public class Setting {
    enum Size{
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        EnumSet<Size> sizes1 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        TreeSet<Integer> treeSet =  new TreeSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        set.add(2);
        set.add(3);
        set.add(6);
        System.out.println("Set : " + set);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------");
        System.out.println("Sizes : " + sizes);
        System.out.println("Between Medium and extralarge : " + sizes1);
        System.out.println("------------------------");
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(112);
        System.out.println(treeSet);
        System.out.println(treeSet.first()); // maximum value of the treeSet
        System.out.println(treeSet.last());  // minimum value of the treeSet
        System.out.println("Removed First Element : " + treeSet.pollFirst());
        System.out.println("Removed Last Element : " + treeSet.pollLast());
        System.out.println("-----------------------");
        arrayList.add(11);
        arrayList.add(2);
        arrayList.add(32);
        arrayList.add(14);
        System.out.println("Unsorted ArrayList :" + arrayList);
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList : " + arrayList);
        Collections.shuffle(arrayList);
        System.out.println("ArrayList using shuffle : " + arrayList);

    }
}
