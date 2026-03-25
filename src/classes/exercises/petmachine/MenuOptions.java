package classes.exercises.petmachine;

import java.util.Scanner;

public class MenuOptions {

    public final static Scanner scanner = new Scanner(System.in);
    public static PetMachine petMachine = new PetMachine();

    public static void bathingPets(){
        petMachine.bathingThePet();
    }

    public static void setPetInMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Type Pet name: ");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }

}
