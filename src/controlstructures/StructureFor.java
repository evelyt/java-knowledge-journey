package controlstructures;

import java.util.Scanner;

public class StructureFor {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        // infinite loop > for
        for(;;){
            System.out.print("Type your name: ");
            var name = scanner.next();

            //termination condition of For
            if(name.equalsIgnoreCase("exit"))break;

            System.out.println(name);
        }
        //structure for
        for(var i = 0; i<100;i++){
            System.out.print(i+" ");
        }
        System.out.print("\n");
        //print even numbers
        for(var i = 2; i<=100;i+=2){
            System.out.print(i+" ");
        }
        System.out.print("\n");
        //print descending order
        for(var i = 200; i>=0;i--){
            System.out.print(i+" ");
        }
        System.out.print("\n");
        //print odd numbers
        for(var i = 200; i>=0;i--){
            if(i%2==0)continue; //continue is used to move to the next line.
            System.out.print(i+" ");
        }
        System.out.print("\n");
        //using arguments configured in the IDE
        for(var i = 0; i< args.length;i++){
            System.out.println((i+1)+" - "+ args[i]);
        }

    }
}
