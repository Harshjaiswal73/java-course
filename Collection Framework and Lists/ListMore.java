import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMore {
    public static void main(String[] args) {
        
        List<String> fruits = new ArrayList<>();

        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        for(int i=0;i<fruits.size();i++){
            System.out.println("fruits is"+fruits.get(i));
        }

        for (String fruit:fruits) {
            System.out.println("for each fruit"+fruit);
        }

        Iterator<String> fe = fruits.iterator();
        while (fe.hasNext()) {
            System.out.println(fe.next());
        }

        List<String> smalllist = fruits.subList(1, 3);
        System.out.println(smalllist);

    }
}
