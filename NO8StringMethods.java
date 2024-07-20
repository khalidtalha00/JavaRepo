package CWHbasics;

import com.sun.security.jgss.GSSUtil;

public class NO8StringMethods {
    public static void main(String[] args) {
        String name = "Talha Khalid";
        System.out.println("Name is " + name);
        int value = name.length();
        System.out.println("The lenth of your name is " + value);
        String ucase = name.toUpperCase();
        String lcase = name.toLowerCase();
        System.out.println(ucase);
        System.out.println(lcase);

//      trim() method - returns a string after removing the leading and trailing spaces

        String nontrimmedString = "     hello   guys  ";
        String trimmed = nontrimmedString.trim();
        System.out.println(trimmed);

//      substring() method - returns a substring from start to end

        System.out.println(name.substring(4));
        System.out.println(name.substring(4, 9));  //start index is included but end index is not included.INdex start from o

//      replace() method

        String name2 = "Happy";
        System.out.println("After replacing p with r Happy becomes: " + name2.replace('p', 'r'));
        System.out.println(name2.replace("Ha", "Na"));

//      Startswith() and endswith() method

        System.out.println(name.startsWith("Ta"));   //will always return  a boolean value. i.e True or false
        System.out.println(name.endsWith("kh"));

        // charAt() methgod- returns character at a  given position

        System.out.println(name2.charAt(1));

//        indexOf() method returns index of a specified character or string
        System.out.println(name2.indexOf('p')); //index at which the character arrived first time
        System.out.println(name2.indexOf("Ha"));

//        lastIndexOf() method-gives the last time index of a process
        System.out.println(name2.lastIndexOf('p'));

//        equals() method
        System.out.println(name2.equals("Happy"));
        System.out.println(name2.equals("happy")); //will not ignore lowercase
        System.out.println(name2.equalsIgnoreCase("haPpY")); // will ignore case

//        escape sequence characters =  \n, \ , \t, \\ etc
        System.out.println("Escape sequence characters.\"Double quotes\"");
        System.out.println("Escape sequence characters.\\backslash");
        System.out.println("Escape sequence characters.\t newtab");
    }

}
