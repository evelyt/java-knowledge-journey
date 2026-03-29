package classes.exercises.bankaccount;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int option;

        while(true){
            System.out.println(".......Make your choice: ");
            System.out.println("1. Consult your balance");
            System.out.println("2. Consult your overdraft");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Pay bill");
            System.out.println("6. Check if the account is using overdraft protection.");
            System.out.println("0. Exit");

            option = scanner.nextInt();

            switch (option){
                case 1 -> MenuOptions.consultBalance();
                case 2 -> MenuOptions.consultOverdraft();
                case 3 -> MenuOptions.depositAndCreateAnAccount();
                case 4 -> MenuOptions.withdrawMoney();
                case 5 -> MenuOptions.payBill();
                case 6 -> MenuOptions.checkOverdraftUsage();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
