package JavaBasic;

public class VariableNarrowingwidening {

    public static void main(String[] args)
    {
//        byte => short => int => float => long => double
//        widening (implicit casting) in java process of covert smaller datatype in larger data type

         int a = 9;
         double b = a;

        System.out.println("integer " + a);
        System.out.println("dubble " + b);

//    double => long => float => int => short =>byte
//    Narrowing (explicit casting )in java process of conver larger datatype in larger data using (explicit casting) using ()

       double c = 10.75;
       int d = (int)c;

        System.out.println("double " + c);
        System.out.println("integer " + d);

    }
}
