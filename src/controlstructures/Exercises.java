package controlstructures;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("type a exercise number: ");
        var exercise = scanner.nextInt();
        if(exercise == 1)firstExercise();
        if(exercise == 2)secondExercise();
        if(exercise == 3)thirdExercise();
//        if(exercise == 4)fourExercise();
    }

    public static void firstExercise(){
        //multiplication table
        System.out.println("1. Multiplication Table");
        var scanner = new Scanner(System.in);
        System.out.println("type a number: ");
        var number = scanner.nextInt();
        for(var i = 1; i<=10;i++){
            System.out.println(i +" x " +number+ " = "+(i*number));
        }
    }
    public static void secondExercise(){
        //imc calculate
        System.out.println("2. IMC calculate");
        var scanner = new Scanner(System.in);
        System.out.println("type your weight:");
        var weight = scanner.nextFloat();
        System.out.println("type your height:");
        var height = scanner.nextFloat();

        var imc = weight/(height*height);

        if(imc <= 18.5)System.out.println("Underweight");
        if(imc >= 18.6 && imc <= 24.0)System.out.println("Ideal Weight");
        if(imc >= 25.0 && imc <= 29.9)System.out.println("Slightly overweight");
        if(imc >= 30.0 && imc <= 34.9)System.out.println("Grade obesity 1");
        if(imc >= 35.0 && imc <= 39.9)System.out.println("Grade obesity 2 (Severe)");
        if(imc > 40)System.out.println("Grade obesity 3 morbid");
    }
    public static void thirdExercise(){
        System.out.println("3. Printing odd or even number and in descending order on the scream");
        var scanner = new  Scanner(System.in);

        System.out.println("Type the first number:");
        var firstNumber = scanner.nextInt();
        System.out.println("Type the second number (It must be larger than the first.):");
        var secondNumber = scanner.nextInt();

        if(secondNumber<firstNumber){
            System.out.println("The second number it must be larger than the first. Start Over!!");
            return;
        }

        System.out.println("Do you choose pair or odd\n" +
                "Type 1: to choose pair\n" +
                "Type 2: to choose odd");
        var choice = scanner.nextInt();
       for(var i = firstNumber; i<=secondNumber; i++){
           if(choice == 1 && i%2==0)System.out.print(i+" ");
           else if(choice == 2 && !(i%2==0))System.out.print(i+" ");
       }
        System.out.println("");
       for(var i = secondNumber; i>=firstNumber;i--){
           System.out.print(i+" ");
       }
    }
//    public static void fourExercise(){
//
//    }
}

