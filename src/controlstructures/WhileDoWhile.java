package controlstructures;

import java.util.Scanner;

public class WhileDoWhile {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        var name = "";
        // first way to use while
        while(!name.equals("exit")){
            System.out.print("Type your text: ");
            name = scanner.next();
            System.out.println(name);
        }
        System.out.println("...end first while");
        // other way to use while
        while(true){
            System.out.print("Type your name: ");
            name = scanner.next();
            System.out.println(name);

            if(name.equalsIgnoreCase("exit"))break;
        }
        System.out.println("...end second while");
        // do and while
        var number = 0;
        do{
            System.out.print(number+" ");
            number++;
        }while(number<10);
        System.out.println("\n...end third while");
    }
}
