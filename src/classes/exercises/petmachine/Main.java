package classes.exercises.petmachine;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private static PetMachine petMachine = new PetMachine();

    public static void main(String[] args){

        int option = -1;

        while(true){
            System.out.println(".......Make your choice: ");
            System.out.println("1. Bathing the pet");
            System.out.println("2. Fill with water ");
            System.out.println("3. Fill with shampoo");
            System.out.println("4. Check water level");
            System.out.println("5. Check shampoo level");
            System.out.println("6. Check if there are any pets in the machine");
            System.out.println("7. Place the pet in the machine");
            System.out.println("8. Remove the pet in the machine");
            System.out.println("9. Clean the machine");
            System.out.println("0. Exit");

            option = scanner.nextInt();

            switch (option){
                case 1 -> MenuOptions.bathingPets();
                case 2 -> MenuOptions.fillWithWater();
                case 3 -> MenuOptions.fillWithShampoo();
                case 4 -> MenuOptions.verifyWaterLevel();
                case 5 -> MenuOptions.verifyShampooLevel();
                case 6 -> MenuOptions.verifyIfHasPetInMachine();
                case 7 -> MenuOptions.setPetInMachine();
            }
        }
    }
}
