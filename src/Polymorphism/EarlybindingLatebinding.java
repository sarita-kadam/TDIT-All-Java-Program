package Polymorphism;

class AAA {

    int add(int a, int b){
        return a +b;
    }

    double add(int a , double b){
        return a +b;
    }
}
class BBB {

    void show(){
        System.out.println(" parent class method overriding");
    }
}
class CCC extends BBB {

    @Override
    void show() {
        System.out.println("child class method overriding");
    }
}
public class EarlybindingLatebinding {

    public static void main(String[] args) {

        AAA obj = new AAA();   // int add
        int result = obj.add(23,78);
        System.out.println(result);

        BBB obj1 = new CCC();   //child class method overriding
        obj1.show();
    }

}

