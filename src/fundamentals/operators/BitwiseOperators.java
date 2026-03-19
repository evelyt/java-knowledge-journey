package fundamentals.operators;

public class BitwiseOperators {
    public static void bitwiseOperators(){
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        System.out.println("\n -- Bitwise Operators --\n" +
                "a = 5 > Binary: 0101\n" +
                "b = 3 > Binary: 0011\n");
        System.out.println("1. AND (&): Returns 1 if both bits are 1" +
                " a & b = " + (a & b)); // 0001 = 1
        System.out.println("2. OR (|): Returns 1 if at least one bit is 1" +
                " a | b = " + (a | b)); // 0111 = 7
        System.out.println("3. XOR (^): Returns 1 if the bits are different" +
                " a ^ b = " + (a ^ b)); // 0110 = 6
        System.out.println("4. NOT (~): Inverts all bits (complement)" +
                " ~a = " + (~a)); // Inverts 0101 -> -6
        System.out.println("// 5. Left Shift (<<): Multiplies by 2^n" +
                " a << 1 = " + (a << 1)); // 01010 = 10
        System.out.println("6. Right Shift (>>): Divides by 2^n" +
                " a >> 1 = " + (a >> 1)); // 0010 = 2
    }
}
