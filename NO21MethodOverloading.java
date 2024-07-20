package CWHbasics;

public class NO21MethodOverloading {
    // overloaded methods = methods that share the same name but different parameters


    static int add(int a,int b){
        System.out.println("Overloaded method #1 to add two integers");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("Overloaded method #2 to add three integers");
        return a+b+c;
    }

    static int add(int a, int b, int c,int d){
        System.out.println("Overloaded method #3 to add four integers");
        return a+b+c;
    }

    static double add(double a, double b){
        System.out.println("overloaded method #4 to add two doubles");
        return a+b;
    }
    static double add(double a, double b,double c){
        System.out.println("overloaded method #4 to add three doubles");
        return a+b+c;
    }


    public static void main(String[] args) {
        System.out.println(add(1,3));
        System.out.println(add(1,3,6));
        System.out.println(add(1,3,6,45));
        System.out.println(add(1.56,3.87));
        System.out.println(add(1.678,3.567,6.009));
    }
}



