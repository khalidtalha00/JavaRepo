package CWHbasics;

public class NO5PrecedenceandAssociativity {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        /*
        associativity is left to right in case of / and *
         30-17
         = 13

         */




        int b = 60/5-34*2;
        /*
        *   12-34*2
        *   12-68
        *   = -56
        *
        *
        * */
        System.out.println(a);
        System.out.println(b);
    }
}
