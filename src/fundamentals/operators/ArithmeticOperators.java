package fundamentals.operators;

public class ArithmeticOperators {
    public static void arithmeticOperators(){
        int a = 13;
        int b = 5;
        System.out.println("\n-- Arithmetic Operators --\n");
        System.out.printf("A > %d and B > %d\n",a,b);
        System.out.printf(" + (Addition): a + b > %d\n",addition(a,b));
        System.out.printf(" - (Subtraction): a - b > %d\n",subtraction(a,b));
        System.out.printf(" * (Multiplication): a * b > %d\n",multiplication(a,b));
        System.out.printf(" / (Division): a + b > %d\n",division(a,b));
        System.out.printf(" Remainder of the division: %d\n",remainder(a,b));

    }
    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }
    public static int remainder(int a, int b){
        return a%b;
    }
}
