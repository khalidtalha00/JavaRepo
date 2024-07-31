//abstract class MyClass{
//
//}
//
//
//
//
//public class Abstract {
//    public static void main(String[] args) {
//        MyClass class1 =new MyClass();  // MyClass is abstract and cannot be instantiated
//    }
//}



// however we can make reference of an abstract class
abstract class MyClass{

}
class class1 extends MyClass{

}

public class Abstract {
    public static void main(String[] args) {
        MyClass c =new class1();  // no error
    }
}
