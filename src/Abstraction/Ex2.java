package Abstraction;

//Is abstract class allow to define private, final, static, and concrete methods? yes

abstract class CCC{

    private void show(){
        System.out.println("private method");
    }

    final void test(){
        System.out.println("final method");

    }

    static void add(){
        System.out.println("static method");
    }

    void dummy(){
        System.out.println("concreate method");
    }
}


public class Ex2 {


}
