class Dog1 {
    int id;
    String name;

    public void eat() {
        System.out.println(name + " with dog id "+id+" eats");
    }
}


public class oops3 {
    public static void main(String[] args) {
        Dog1 mydog = new Dog1();
        mydog.name ="Bruno";
        mydog.id=33451;
        mydog.eat();

    }
}
