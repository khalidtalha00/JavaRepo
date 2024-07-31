import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number to divide:");
            int a = sc.nextInt();
            System.out.println("Enter the number to divide by:");
            int b = sc.nextInt();
            int c = a / b;
        System.out.println("result: "+c);
        }
        catch (ArithmeticException e){
            System.out.println("You cannot divide by 0");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter an integer number");
        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        finally {
            System.out.println("The finally keyword will always execute");
        }

    }
}
