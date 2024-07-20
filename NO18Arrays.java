package CWHbasics;

public class NO18Arrays {
    public static void main(String[] args) {
//        int[] marks = {34,56,78,90,88};
        float[] marks ={34.5f,56.5f,78,90.5f,88.5f};
        System.out.println(marks[2]);

        String[] students ={"Talha","Ram","Shyam","Hari"};
        System.out.println(students[2]);

        // length of array
        System.out.println(marks.length);
        System.out.println(students.length);

        // displaying the array
        System.out.println("Printing The students using for loop ");
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

        //printing array elements using for each

        System.out.println("Printing students name using for each");
        for (String element:students){
            System.out.println(element);
        }
    }
}
