package CWHbasics;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in English");
        int eng = sc.nextInt();

        System.out.println("Enter your marks in Maths");
        int maths = sc.nextInt();

        System.out.println("Enter your marks in Hindi");
        int hin = sc.nextInt();

        System.out.println("Enter your marks in sst");
        int sst = sc.nextInt();

        System.out.println("Enter your marks in science");
        int science = sc.nextInt();

        int total = eng+maths+hin+sst+science;
        float TotalPercentage=total/5;
        System.out.println("Your total marks is: "+total+" or "+TotalPercentage+"%");

        if(TotalPercentage>=40 && maths>=33 && sst>=33 && eng>=33 && hin>=33 && science>=33){
            System.out.println("Congratulations You have passed");
        }
        else {
            System.out.println("Sorry you failed!");
        }



    }
}
