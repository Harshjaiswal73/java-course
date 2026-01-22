import java.util.ArrayList;
import java.util.*;

public class LearnList {
    
    public static void main(String[] args) {
        
        List <Integer> list = new ArrayList<>();

        //List <Integer> list2 = new ArrayList<>();

        list.add(12);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println(list.get(0));
        list.set(1,200);
        list.remove(Integer.valueOf(1));
        list.indexOf(100);

        // list2.add(10);
        // list2.add(20);
        // list2.add(50);

        // list.addAll(list2);
        // list.removeAll(list2);
        // list.retainAll(list2);

        // list.clear();
        // Object a[] = list.toArray();

        // for(Object e : a){
        //     Integer temp = (Integer) e;
        //     System.out.println(e);
        // }

        // System.out.println(list);
        // System.out.println(list.size());
        // System.out.println(list.contains(20));

        // // value dalker remove kerna
        // System.out.println(Integer.valueOf(30));

        // // index dalker remove kerna 
        // System.out.println(list.remove(20));
        // System.out.println(list.containsAll(list));

    }

}