package controlstructures;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Enter a number of 1 to 7: ");
        int  option = scanner.nextInt();
        switchCaseFirstForm(option);
        switchCaseSecondForm(option);
        System.out.println(switchCaseThirdForm(option));
    }

    public static void switchCaseFirstForm(int option){
        switch (option){
            case 1:
            case 7:
                System.out.println("Weekend > Saturday (number 7) and Sunday (number 1)");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
    public static void switchCaseSecondForm(int option){
        switch (option){
            case 1,7 -> System.out.println("Weekend > Saturday (number 7) and Sunday (number 1)");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            default -> System.out.println("Invalid Option");
        };
    }
    public static String switchCaseThirdForm(int option){
        var message = switch (option){
            case 1,7 -> {
                var day = (option == 1 ? "Sunday" : "Saturday");
                //yield > indicates the return of this switch case option.
                yield String.format("Today is %s, Enjoy your Weekend",day);
            }
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "Invalid Option";
        };
        return message;
    }
}
