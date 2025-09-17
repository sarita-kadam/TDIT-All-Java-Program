package Constructors;

class Constructor {
    Constructor() {
        System.out.println("no-argument constructer");
    }
    Constructor(int a){
        System.out.println("1-argument constructer");

    }
}
public class Ex extends Constructor  {

    Ex(){
        super(10);
        System.out.println("chil class constructer");
    }

    public static void main(String[] args) {

        Ex obj = new Ex();
    }

}