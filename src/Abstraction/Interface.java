
// Interface = refrence type , abstract 100%
// in Interface only method declaration not implementation code

package Abstraction;


//Rule 1.If one abstract class implement one or more interface,
// then it’s not mandatory for that child class to provide method implementation for Abstract method of interface.


interface AAA{
    void test();
    int a = 100;          // we can declare this variable public , static , final
}

interface BBB extends AAA {
    int add(int a,int b);
}

abstract class InterfaceRule implements BBB {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public void test()
    {
        System.out.println("test method");
    }
}

 //Rule 2.	If concreate / Non – Abstract class implement one or more interfaces,
// than its mandatory for that child class to provide method implementation of abstract method of interface.

public class  Interface implements AAA,BBB {

    @Override
    public void test() {


    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Interface obj = new Interface();
        obj.test();
        //obj.add(10,20);
        System.out.println(obj.add(10,20));


    }
}


//package Abstraction;
//
//class Aa {
//
//    interface V {
//        void show();
//    }
//
//    interface E {
//        void show(int a);
//    }
//}
//
//abstract class Bb extends Aa implements Aa.V, Bb.E {
//
//    @Override
//    public void show() {
//        System.out.println("interface");
//
//    }
//
//    @Override
//    public void show(int a) {
//        System.out.println("in method overriding method name & parameter name must be the same");
//
//    }
//
//    void test(){
//        System.out.println("abstract class method");
//    }
//}
//public class Exinterface extends Bb{
//
//    @Override
//    public void show(int a) {
//        System.out.println();
//    }
//
//    @Override
//    public void show() {
//        System.out.println();
//    }
//
//    @Override
//    void test() {
//        System.out.println();
//    }
//}