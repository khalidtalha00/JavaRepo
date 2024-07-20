package CWHbasics;

/*
access modifiers in java =

1. Default
2. Public
3. Private
4. Protected

 */

//in private class we use getters and setters
//getter- returns the value
//setter - sets the value

class MyEmployee{
    private String name;
    private int id;

    public String getName(){      // getter
        return name;

    }
    public void setName(String n){     //setter
        name=n;
    }

    public int  getId(){             // getter
        return id;
    }

    public void setId(int i){        // setter
        id = i;
    }
}

public class NO28AccsessModifiers {
    public static void main(String[] args) {
        MyEmployee Talha = new MyEmployee();
//        Talha.name="Talha Khalid"; // throws an error due to private access modifier
//        Talha.id=334521;

        Talha.setName("Talha Khalid");
        System.out.println(Talha.getName());

        Talha.setId(22345678);
        System.out.println(Talha.getId());

    }
}
