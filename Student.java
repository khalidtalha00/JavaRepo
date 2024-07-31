public class Student {
     int roll;              // roll and name are class attributes
     String name;

    void printdetails(){            // a function or method to print the details of the object
        System.out.println(name);
        System.out.println(roll);
    }

    public static void main(String[] args) {
        Student s1 = new Student();   // student() is a constructor  s1 is object name
        s1.name = "Talha";    //value is allocated
        s1.roll=21;
        s1.printdetails();

        Student s2 =new Student();
        s2.name="Shyam";
        s2.roll=45;
//        s2.printdetails();
        s2.name="Raman";
        s2.printdetails(); // name is changed from shyam to raman



    }
}
