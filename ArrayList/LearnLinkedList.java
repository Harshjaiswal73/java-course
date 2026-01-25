import java.util.List;

public class LearnLinkedList {

    public static void main(String[]args){

        List<String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("orange");

        for(int i=0;i<fruits.size();i++){
            System.out.println("fruits is " + fruits.get(i));
        }
        
        for(String fruit: fruits){
            System.out.println("for each fruits" + fruit);
        }
    }
}