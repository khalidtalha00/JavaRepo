package FileHandling;

import java.io.*;

public class CreateFile {
    public static void main(String[] args)  {

        try {
            File f = new File("C:\\Users\\khali\\Desktop\\newfile.txt");
            System.out.println("File successfully created!");

            if (f.createNewFile()) {
                System.out.println("File Successfully created");
            } else {
                System.out.println("File already exists");

            }
        }
        catch (IOException e){
            System.out.println("IO Exception Occurred");
        }



    }
}
