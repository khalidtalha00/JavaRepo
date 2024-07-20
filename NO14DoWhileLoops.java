package CWHbasics;

public class NO14DoWhileLoops {
    public static void main(String[] args) {
        // do while loop will execute the statement at least once then check the condition
        int a = 5;
//        int a = 15;  even if a is 15 which is >10 it will print 15 once before checking the condition
        do {
            System.out.println(a);
            a++;
        } while (a <= 10);
    }
}
