package Static;

class A {
    static void show(){

    }
}
class B {
    static void show(){
        System.out.println("static 2");
    }
}
public class StaticEx {

    public static void main(String[] args) {


//        B obj = new B();
//        obj.show();      //    static 2

//         B obj = A();    // not work because of java does not support downcasting
//         obj.show();

//        A obj = new B();    // without extends can not work ( casting case)
//        obj.show();


//        A obj = new A();     // without extends print static 1
//        obj.show();


         A.show(); // blank o/p  beacuse of not any implimentation of this method
         B.show(); // static 2   beacuse of static can not need creating a object we can use class name & method name

    }
}
