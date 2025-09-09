public class Stringbuilder {
    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("harsh");
         
         System.out.println(sb.length());
         sb.delete(0, 3);
         System.out.println(sb);
         sb.insert(0, 'y');
         sb.delete(2,2);
         sb.insert(1,'a');
         System.out.println(sb);

        
        }
}
