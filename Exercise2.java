package CWHbasics;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        String name = "John Wick";
        System.out.println(name.toLowerCase());
        System.out.println(name.replace(' ','_'));


        String letter= "Dear <|name|>, THanks a lot";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name1= sc.nextLine();
//        System.out.println(name1);
        System.out.println(letter.replace("<|name|>",name1));


        String letter1="Dear Talha!\n This course is nice.\tTHanks ";

        System.out.println(letter1);




    }
}
