import java.util.Scanner;
class program4{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number : ");

        int num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}