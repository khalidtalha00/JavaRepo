import java.util.Scanner;

interface client{
    void input();
    void output();
}


 class Developer implements client {
    String name;
    int salary;
     @Override
     public void input() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your name");
          name = sc.nextLine();
         System.out.println("Enter your salary");
          salary = sc.nextInt();
     }

     @Override
     public void output() {
         System.out.println("Hello employee "+name+ " your salary is "+salary);

     }

     public static void main(String[] args) {
         client c = new Developer();
         c.input();
         c.output();
     }

 }
