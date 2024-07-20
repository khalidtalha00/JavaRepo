package CWHbasics;
import java.util.Scanner;

public class ExerciseOnePercentageCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in English");
        float english = sc.nextFloat();

        System.out.println("Enter marks in maths");
        float maths = sc.nextFloat();

        System.out.println("Enter marks in hindi");
        float hindi = sc.nextFloat();

        System.out.println("Enter marks in science");
        float science = sc.nextFloat();

        System.out.println("Enter marks in sst");
        float sst = sc.nextFloat();

        float total = english+maths+science+sst+hindi;
        float percentage = total/5;
        System.out.println("Your total percentage is: "+percentage +" %");


    }
}
