package CWHbasics;

public class NO7StringInJava {
    public static void main(String[] args) {
        // in Java string is a class, instead of a data type.JAva has special support for string.
        // Strings are immutable in Java meaning once created it cannot be changed.
//        String name = new String("Talha Khalid");
        String name = "Talha Khalid";
        System.out.println("Hello "+name);


        // print() vs println() vs printf()

        System.out.print("Hi"); // the print() statement  will not print space after "Hi" and "Welcome"
        System.out.print("Welcome ");
        System.out.println("This is  ");// however it will print after println()
        System.out.println("a Newline ");

        // printf() statement
        int x = 5;
        float y= 7.8f;
        String FullName = "Talha Khalid";
        System.out.printf("The value of x  is %d and the value of y is %f",x,y);
        System.out.printf("Your full name is %s",FullName);



    }
}
