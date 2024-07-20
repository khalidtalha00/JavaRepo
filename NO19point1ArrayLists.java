package CWHbasics;

import java.util.ArrayList;


public class NO19point1ArrayLists {
    // array list = a resizable array
    //  elements can be added and removed after compilation phase which we cannot do with arrays
    // used to store reference data types
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");      // array list add method
        food.add("Hamburger");
        food.add("Hotdogs");

        food.set(0,"Sushi");   // array list add method

        food.remove(1); // arraylist remove method

//        food.clear();  array list clear method

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
