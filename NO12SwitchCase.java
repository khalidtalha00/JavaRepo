package CWHbasics;
import java.util.Scanner;

public class NO12SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
//        System.out.println(age);
        switch (age) {
            case 18:
                System.out.println("You should start focusing on your life");
                break;
            case 22:
                System.out.println("You should get a job");
                break;
            case 30:
                System.out.println("You should get married");
                break;
            case 75:
                System.out.println("You should retire");
                break;
            default:
                System.out.println("Enjoy your life");


//                agar switch ke baad break nahi lagaya to ek case ke fulfil baad saare statements ko execute kar dega including default

        }
    }
}
