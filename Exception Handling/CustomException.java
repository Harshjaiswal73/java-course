import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");

        try{
            int age = sc.nextInt();
            if(age > 100){
                throw new MyException("my error is this");
            }
        }catch( Exception e){
            System.out.println();
        }

    }
}
class MyException extends Exception{
    public MyException(String message){
        super(message);
    }

}