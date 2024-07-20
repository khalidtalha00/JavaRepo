package CWHbasics;
import java.util.Scanner;

public  class NO3user_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);            //creating sc object from scanner class
        System.out.println("Enter first number:");
//        int a=sc.nextInt();
        float a=sc.nextFloat();
        System.out.println("Enter second number");
//        int b=sc.nextInt();
        float b=sc.nextFloat();
        float sum=a+b;
        System.out.println("The sum is: "+sum);

//     let's check if a user input is int or not

        System.out.println("Enter to check if the input is int or not:");
        boolean x = sc.hasNextInt();
        System.out.println(x);

    }
}