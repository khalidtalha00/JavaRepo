package CWHbasics;
import java.util.Scanner;

public class NO9IfElseConditionals {
    public static void main(String[] args) {

        // Decision making in java
//            1.If-else statements
//            2.Switch statements

//        int age = 18;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        if (age>=18){

            System.out.println("You can drive");
        }
        else {
            System.out.println("Sorry you cannot drive");
        }
    }
}
