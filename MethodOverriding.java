class Animal{    //
     void makesound(){  //superclass method
        System.out.println("This animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makesound() {   // subclass method
        System.out.println("The cat says Meow!");
    }
}
    class Dog extends Animal{
        void makesound(){
            System.out.println("The dog says woof woof!");
        }
    }

public class MethodOverriding {
    public static void main(String[] args) {
        Animal mycat = new Cat();
        mycat.makesound();
        Animal mydog= new Dog();
        mydog.makesound();
    }
}
