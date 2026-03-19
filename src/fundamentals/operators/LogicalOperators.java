package fundamentals.operators;

public class LogicalOperators {
    public static void logicalOperators(){
        boolean a = true;
        boolean b = false;

        System.out.println("\n -- Logical Operators --\n" +
                "a = true and b = false");

        System.out.println(" && (Logical AND): Returns true only if both conditions are true: a && b");
        System.out.println(a && b); // false (both must be true)
        System.out.println("|| (Logical OR): Returns true if at least one of the conditions is true: a || b");
        System.out.println(a || b); // true (one of them is true)
        System.out.println("! (Logical NOT): Unary operator that inverts the boolean value. " +
                "true becomes false and vice versa: !a");
        System.out.println(!a);     // false (inverts the value)
        System.out.println("^ (Logical XOR - Exclusive OR): Returns true if the conditions are different " +
                "(one true and the other false), but false if both are the same: a ^ a");
        System.out.println(a ^ a);  // false (they are equal)


    }
}
