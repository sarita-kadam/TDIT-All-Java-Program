
package Inheritance;

// Hierarchical Inheritance

// One parent, many children.
// When multiple child classes inherit from the same parent class.


class parent1{
    void show()
    {
        System.out.println("parent class");
    }

}

class child1 extends parent1 {
    void test(){
        System.out.println("1-child class");
    }
}

class Child2 extends parent1{
    void add(){
        System.out.println("2-child class");
    }
}

class child3 extends parent1{
    void dummy()
    {
        System.out.println("3-child class");
    }
}
public class Hierachical {

    public static void main(String[] args) {


        child3 obj = new child3();
        obj.show();  // parent class
        obj.dummy(); // 3-child class


        child1 obj1 = new child1();
        obj1.show(); // parent class
        obj1.test(); // 2-child class

        Child2 obj2 = new Child2();
        obj2.show(); // parent class
        obj2.add();  //3-child class

    }

}
