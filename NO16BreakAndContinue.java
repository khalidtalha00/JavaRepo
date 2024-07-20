package CWHbasics;

public class NO16BreakAndContinue {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            System.out.println(i+". Java is Great!");
            if (i==5){
                System.out.println("Ending the loop");
                break;
            }
        }
// break statement using while loop

        int j =0;
        while (j<=10){
            System.out.println(j+". Using while loop");
            j++;
            if (j==5){
                break;
            }
        }

        // Break statement Using do while loop
        int k=0;
        do{
            System.out.println(k+". Using do while loop");
            k++;
            if(k==5) {
                System.out.println("The loop ends here");
                break;
            }
        }while (k<=10);


        // Continue statement

        for (int l=0;l<=10;l++){

            if (l==5){
                System.out.println("we have skipped 5 using continue statement");
                continue;
            }
            System.out.println(l);
        }

        // continue statement using do while loops

        int m =0;
        do {
            if (m==5){
                continue;
            }
            System.out.println(m);
            m++;
        }while (m<=10);


    }
}
