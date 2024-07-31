public class MethodOverloading {
    static int add(int a,int b){   //two parameters
        return a+b;
    }
    static int add(int a,int b,int c){    //three parameters
        return a+b+c;
    }

    static double add(double a,double b){     // different data type of parameter
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println(add(1,2));
        System.out.println(add(1,2,6));
        System.out.println(add(1.7667,2.7844));

    }
}
