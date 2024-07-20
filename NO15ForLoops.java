package CWHbasics;
import java.util.Scanner;

public class NO15ForLoops {
    public static void main(String[] args) {
        for (int i=1; i<=10;i++){
            System.out.println(i);
        }

        // program to print n even numbers
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= sc.nextInt();
        System.out.println("first "+n+" even numbers are: ");
        for (int i=1; i<=n;i++){
            System.out.println(2*i);
        }
        System.out.println("First "+n+" odd numbers are: ");
        for (int i=1;i<=n;i++){
            System.out.println(2*i+1);
        }

        System.out.println("\n");


        //decrementing with for loop
        for (int i=10;i>=0;i--){
            System.out.println(i);
        }

    }
}
