import java.util.Scanner;
class program3{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number : ");
        System.out.println("enter a second number :");


        int num = sc.nextInt();
        int num2 = sc.nextInt();

        if(num > num2)
           System.out.println("num is greator than num2");
        else
           System.out.println("num2 is gretor than num");
    }
}