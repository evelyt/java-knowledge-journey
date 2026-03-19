package exercises.fundamentals;

import java.time.LocalDate;
import java.util.Scanner;

public class BeginnerExercises {
    public static void main(String[] args){
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
    }
    public static void exerciseOne(){
        /*
        Write a code: get a name and year of birth of someone.
        Print the message: Hello, 'Name here' you are 'age' years old.
         */
        System.out.println("1. Get a name and year of birth and print on scream:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = scanner.nextLine(); //name

        System.out.print("Type your year of birth: ");
        int birth = scanner.nextInt(); //year of birth
        int actualYear = LocalDate.now().getYear(); // actual year
        int age = actualYear - birth;

        System.out.println("Hello, "+ name+", you are " +age+" years old." +
                "\n...end exercise one.\n");
    }

    public static void exerciseTwo(){
        /*
        Write a code: Write a code: obtain the length of one side of a square.
        Calculate the area and print it to the screen.
        Formula: area = side * side
         */
        System.out.println("2. Calculate the area of a square");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the size of side:");
        int side = scanner.nextInt();
        int area = side * side;
        System.out.println("The area of square is: " +
                area +
                "\n...end exercise two\n");

    }

    public static void exerciseThree(){
        /*
        Write a code: get the base and height of a rectangle.
        Calculate the area and print it to the screen.
        Formula: area = base * height
         */
        System.out.println("3. Calculate the area of a rectangle.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the base of rectangle:");
        int base = scanner.nextInt();
        System.out.print("Type the height of rectangle:");
        int height = scanner.nextInt();
        int area = base * height;

        System.out.println("The area of rectangle is: " +
                area +
                "\n...end exercise three\n");
    }

    public static void exerciseFour(){
        /*
        Write a code: get the name and age of two people.
        Print the age difference between them on the screen.
         */
        System.out.println("4. Age difference");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Type the second name: ");
        String secondName = scanner.nextLine();
        System.out.print("Type the first age: ");
        int firstAge = scanner.nextInt();
        System.out.print("Type the second age: ");
        int secondAge = scanner.nextInt();

        int ageDifference = firstAge - secondAge;

        System.out.println("The difference between " +
                firstName+ " and "+secondName+
                " is " + Math.abs(ageDifference)+" years.\n" +
                "...end exercise four");
    }
}
