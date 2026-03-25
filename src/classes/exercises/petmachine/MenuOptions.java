package classes.exercises.petmachine;

import java.util.Scanner;

public class MenuOptions {

    public final static Scanner scanner = new Scanner(System.in);
    public static PetMachine petMachine = new PetMachine();

    public static void setPetInMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Type Pet name: ");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }

    public static void bathingPets(){
        petMachine.bathingThePet();
    }

    public static void fillWithShampoo(){
        petMachine.addShampoo();
    }

    public static void fillWithWater(){
        petMachine.addWater();
    }

    public static void verifyWaterLevel(){
        petMachine.waterLevel();
    }

    public static void verifyShampooLevel(){
        petMachine.shampooLevel();
    }

    public static void verifyIfHasPetInMachine(){
        petMachine.verifyPet();
    }
}
