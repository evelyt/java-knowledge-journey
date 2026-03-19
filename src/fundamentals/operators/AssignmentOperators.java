package fundamentals.operators;

public class AssignmentOperators {
    public static void assignmentOperators(){
        int a = 13;
        int b = 5;
        System.out.println("-- Assignment Operators --\n");
        System.out.printf("A > %d and B > %d\n",a,b);
        System.out.printf(" = (Simple Assignment): a = b >  %d\n",simpleAssignment(a,b));
        System.out.printf(" += (Addition and Assignment): a += b (equivalent to a = a + b) > %d\n",additionAssignment(a,b));
        System.out.printf(" -= (Subtraction and Assignment): a -= b (equivalent to a = a - b) > %d\n",subtractionAssignment(a,b));
        System.out.printf(" *= (Multiplication and Assignment): a *= b > %d\n",multiplicationAssignment(a,b));
        System.out.printf(" /= (Division and Assignment): a /= b > %d\n",divisionAssignment(a,b));
        System.out.printf(" Remainder of the division and allocation: %d\n", remainderAssignment(a,b));
    }

    public static int simpleAssignment(int a, int b){
        a = b;
        return a;
    }
    public static int additionAssignment(int a, int b){
        return a += b;
    }
    public static int subtractionAssignment(int a, int b){
        a -=b;
        return a;
    }
    public static int multiplicationAssignment(int a, int b){
        a *=b;
        return a;
    }
    public static int divisionAssignment(int a, int b){
        a /=b;
        return a;
    }
    public static int remainderAssignment(int a, int b){
        a %=b;
        return a;
    }


}
