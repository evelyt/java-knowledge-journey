package controlstructures;

public class IfElse {
    public static void main(String[] args){
        var name = "Camilla";
        var age = 16;
        var emancipated = false;

        // If, else and else if
        //Enter IF is true, otherwise, skip to the next line.
        if(age >= 18)System.out.printf("%s you are %s years old, you can drive.\n",name,age);
        //IF is false, execute else if:
        else if(age >=16 && emancipated){
            System.out.printf("%s you are %s years old and emancipated, you can drive.\n",name,age);
        }
        //Else if is false, execute else:
        else{
            System.out.printf("%s, you can't drive.\n",name);
        }
    }

}
