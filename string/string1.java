import java.util.Scanner;
class string1{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter any name : ");
        
        String name = sc.next();

        System.out.println(name.length());
    }
}