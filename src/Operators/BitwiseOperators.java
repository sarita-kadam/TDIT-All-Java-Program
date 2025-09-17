package Operators;

public class BitwiseOperators {

    public static void main(String[] args) {

        int a = 5;  // 0101
        int b = 3;  // 0011
        System.out.println(a & b); // 0001 -> 1  (Bitwise AND & )

        System.out.println(a | b); // 0111 -> 7  (Bitwise OR | )

        System.out.println(a ^ b); // 0110-> 6   (Bitwise XOR ^ )

        System.out.println(~ a);  // 0000..0101 -> -6  (Bitwise NOT ~)

        System.out.println(a << 1); // 5 * 2 = 10   (Left Shift <<)

        System.out.println(a >> 1); //  (Right Shift >>)

        System.out.println(a >>> 1);  // (Unsigned Right Shift >>>)
    }
}
