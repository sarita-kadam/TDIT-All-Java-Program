package Operators;

public class UnaryOperators {

    // used for increment(++) decrement(--)


    public static void main(String[] args) {

         int a = 2;

        System.out.println("post-increment = " + a++);   //Uses value first, then increments //3
        System.out.println(a);

        int b = 5;
        System.out.println("pre-increment = " + ++b);    //Increments first, then uses value. //6
        System.out.println(b);

        int c = 6;
        System.out.println("post-decrement = " + c--);    // Uses value first, then decrements. // 5
        System.out.println(c);

        int d = 4;
        System.out.println("pre-decrement = " + --d);    //Decrements first, then uses value. // 3
        System.out.println(d);

        boolean e = true;
        System.out.println(!e);                       // ! , Inverts a boolean value    // false


    }
}

//•	(++) Increments by 1.
//   Post-Increment:  Uses value first, then increments.
//   Pre-Increment:   Increments first, then uses value.
//
//•	(--) Decrements by 1.
//    Post-Decrement: Uses value first, then decrements.
//    Pre-Decrement: uses decrement, then decrements.
//
//•	(! ) Inverts a Boolean value. (value is true than print false & value is false than print true)