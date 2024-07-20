package CWHbasics;

public class NO10LogicalOperators {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean a = true;
//        boolean b = false;
        boolean b = true;

        if(a&& b){
            System.out.println("True");
        }
        else{
            System.out.println("False"); //logical && is true if and only if both values are true
        }


        System.out.println("For Logical OR...");
        boolean a1 = false;
        boolean b1 = true;

        if(a1 || b1){
            System.out.println("True");
        }
        else{
            System.out.println("False"); //logical || is true if either of the values are true;
        }

        System.out.println("For logical NOT.....");
        boolean c = false;
        System.out.println("NOT of "+c +" is "+!c);
    }
}
