package controlstructures;

public class IfElse {
    public static void main(String[] args){
        var name = "Camilla";
        var age = 16;
        var emancipated = true;

        var canDrive = (age >= 18) || (age >=16 && emancipated);
        var message = "";

        // If, else and else if
        if(canDrive) message = name + " you are "+age+" years old, you can drive.\n";
        else{
            message = name +", you can't drive.\n";
        }

        /*
        We can use ternary operator:
        message = canDrive ? name + " you are "+age+" years old, you can drive.\n": name +", you can't drive.\n";
        */

        System.out.println(message);
    }

}
