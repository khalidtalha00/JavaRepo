package CWHbasics;

public class NO17Arrays {
    public static void main(String[] args) {
        /* suppose you have to store marks of 500 students you have two options-
        1. Create 100 variables

        2. use arrays (Recommended)

         */

        int [] marks = new int[5];    // index from 0 to 4. [5] is sizeof array
        marks[0] = 55;
        marks[1] = 89;
        marks[2] = 90;
        marks[3] = 67;
        marks[4] = 78;
        marks[4] = 99; // now mark 4 value is changed from 78 to 89

        System.out.println(marks[4]);
        System.out.println(marks[1]);
        System.out.println(marks[3]);

        // another way to create and initialize an array

        int [] marks1={2,45,67,89,90};
        System.out.println(marks1[4]);
        System.out.println(marks1[2]);
        System.out.println(marks1[0]);
        System.out.println(marks1[3]);
    }
}
