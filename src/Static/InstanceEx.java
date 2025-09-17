package Static;

class C {
    void show(int a){
        System.out.println("instatnce 1");
    }
}
class D extends C{
    void show(){
        System.out.println("instance 2");
    }
}
public class InstanceEx {
    public static void main(String[] args) {

          D obj = new D();    // instance 2
          obj.show();
          obj.show(10);

//        C obj = new C();    // instance 1
//        obj.show();

//        C obj = new D();  // can not casting without extends  o/p = instance 2 ( bcz object type matter )
//        obj.show();

//        D obj = new C();   // not work because of java does not support downcasting
//        obj.show();

//         D.show();        // non-static method need object
    }
}
