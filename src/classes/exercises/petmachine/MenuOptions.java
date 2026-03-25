package classes.exercises.petmachine;

import java.util.Scanner;

public class MenuOptions {

    public final static Scanner scanner = new Scanner(System.in);
    public static PetMachine petMachine = new PetMachine();

    public static void giveShower(){
        System.out.println("Give a shower ");
    }
    public static void setPetInMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Type Pet name: ");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("The pet "+ pet.getName()+" was placed in the machine");
    }

}
