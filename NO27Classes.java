package CWHbasics;



class Employee {
    String name;
    int id;
    int salary;
    public void printDetails(){
        System.out.println("My name is: "+name);
        System.out.println("My ID is: "+id);
        System.out.println("\n");
    }
    public int getsalary(){
        return salary;
    }
}


public class NO27Classes {
    public static void main(String[] args) {


            Employee emp1 = new Employee();  // initialising an employee object
            Employee emp2 = new Employee();
            // setting attributes
            emp1.name="Talha Khalid";
            emp1.id=22341;
            emp1.salary = 3487;

            emp2.name="John";
            emp2.id=223451;

//        System.out.println("The name of employee 1 is: "+emp1.name);
//        System.out.println("The id of employee 1 is: "+emp1.id);
        emp1.printDetails();
        emp2.printDetails();
        System.out.println(emp1.getsalary());

        }
    }

