import java.util.Scanner;
class program5{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a first number : ");
        System.out.println("enter a second number : ");
        System.out.println("enter a third number : ");

        int num = sc.nextInt();

        int num2 = sc.nextInt();

        int num3 = sc.nextInt();

        if(num>num2)
        {
            System.out.println("number1 is greator than number2 and number3");
        }
        else if(num2>num3)
        {
            System.out.println("number2 is greator than number3 and number1");
        }
        else{
            System.out.println("number3 is greator than number2 and number1");
        }
    }
}