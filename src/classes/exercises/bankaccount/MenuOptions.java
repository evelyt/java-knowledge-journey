package classes.exercises.bankaccount;

import java.util.Scanner;

public class MenuOptions {

    public static BankingOperations bankingOperations = new BankingOperations();
    public static Scanner scanner = new Scanner(System.in);

    public static void depositAndCreateAnAccount() {
        System.out.println("Hello!!%nFirst time here? 1: Yes and 2: Not");
        int select = scanner.nextInt();

        System.out.println("Enter the amount you wish to deposit into you account:");
        float amount = scanner.nextFloat();

        if(select == 1)bankingOperations.createAnAccount(amount);
        if(select == 2)bankingOperations.setMoney(amount);
    }
    public static void withdrawMoney(){
        System.out.println("Hello!!%nEnter the amount you wish to withdraw:");
        float amount = scanner.nextFloat();

        System.out.println("Hello!!%nUsing overdraft? 1: Yes and 2: Not");
        int select = scanner.nextInt();
        if(select == 1)bankingOperations.setUseOverdraft(true);

        bankingOperations.withdrawMoney(amount);
    }
    public static void consultBalance(){bankingOperations.consultBalance(); }
    public static void consultOverdraft(){bankingOperations.consultOverdraft(); }

    public static void payBill() {
        System.out.println("Hello!!%nEnter the amount of Bill:");
        float amount = scanner.nextFloat();

        System.out.println("Hello!!%nUsing overdraft? 1: Yes and 2: Not");
        int select = scanner.nextInt();

        if(select == 1)bankingOperations.setUseOverdraft(true);
        bankingOperations.payBill(amount);
    }

    public static void checkOverdraftUsage() {
        bankingOperations.overdraftUsage();
    }
}
