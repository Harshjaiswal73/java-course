import java.util.Scanner;
class program6{
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("enter a number : ");

       int num = sc.nextInt();

       if(num>0)
       {
        System.out.println("number is positive");
       }
       else if(num<0)
       {
        System.out.println("number is negative");
       }
       else{
        System.out.println("numbe is zero");
       }
    }
}