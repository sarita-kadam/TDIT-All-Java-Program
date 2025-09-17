package Inheritance;

// we can call parent class constructer or method  in child class use super keyword.


class A{

    A(){
        System.out.println("This is construter");
    }

    A(int a){
        System.out.println("This is parameterized Constructer");

    }

    void show(){
        System.out.println("This is show method");
    }

    void show(int a,int b){
        System.out.println("This is parameterized method");
    }
}

class B extends A {

    B(){
        super();
        System.out.println("This is child class constructer");
    }

    B(int b){
        super(10);
        System.out.println("This is child class parametrized constructer");
    }

    @Override
    void show() {
        System.out.println("child class show method");
    }

    @Override
    void show(int a, int b) {
        System.out.println("child class paramerized method");
    }
}
public class EX1 {

    public static void main(String[] args) {

      B obj = new B();
      obj.show();

      A obj2 = new A();

      B obj1 = new B(10);

    }

}

