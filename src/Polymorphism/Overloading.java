package Polymorphism;

//It is process in which we create method in same class with same name
// but different argument list or different method signature.

// Method Signature => Method name + parameter list

class A {

    int add(int a, int b) {
        System.out.println("overloading");
        return a + b;
    }

    public int add(int aa, int bb, int cc) {
        return aa + bb + cc;

    }

    public int add(int s, int v, int m, int k) {
        return s + v + m;

    }

    private float add(float f, int l) {
        return f + l;
    }

    protected String add(int m, int p, String o) {
        return m + p + o;
    }
}

    public class Overloading {
        public static void main(String[] args) {

//        A obj = new A ();
//        int result = obj.add(12,43);
//        System.out.println(result);

//            A obj = new A();
//            obj.add(12, 22);  // only print "Overloading" not return anything

//          int result = obj.add(12, 66, 88);// default
//          System.out.println(result);

//           int result = obj.add(99, 90, 77, 44);// public
//           System.out.println(result);

//           obj.add(66, 99, "java");  // protected

//            int result = obj.add(67, 99); // private
//            System.out.println(result);






        }
    }


//1.	Compiler-Time or Method overloading or early binding or static binding