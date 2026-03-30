package classes.exercises.bankaccount;

public class BankingOperations {

    private float money;
    private float overdraftLimit;
    private float balance;
    private float overdraft;
    private boolean useOverdraft;

    public BankingOperations() {
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
        this.balance += money;
        this.overdraftLimit = this.balance+this.overdraft;
        System.out.println("Your deposit was successful!");
    }

    public float getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(float overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    public boolean isUseOverdraft() {
        return useOverdraft;
    }

    public void setUseOverdraft(boolean useOverdraft) {
        this.useOverdraft = useOverdraft;
    }

    public void consultBalance(){
        System.out.println("The Balance is: "+ getBalance());
    }

    public void consultOverdraft(){
        System.out.println("The Overdraft is: "+ getOverdraftLimit());
    }
    public void createAnAccount(float money){
        if(money <=500){
            this.overdraft = 50;
        }else{
            this.overdraft = money/2;
        }
        this.balance += money;
        this.overdraftLimit = this.balance+this.overdraft;
        System.out.println("Your account was successfully created.");
    }
    public void payment(float money){
        if(this.useOverdraft){
            float sumTaxa = (float) (money+(money*0.20));
            if(this.overdraftLimit >= sumTaxa) {
                this.overdraftLimit -= sumTaxa;
                System.out.println("Payment made with overdraft facility");
            }else {
                System.out.println("balance (overdraft + usage fee) insufficient");
            }
            return;
        }
        if(!this.useOverdraft && this.balance <money){
            System.out.println("Insufficient funds");
            return;
        }
        this.balance -=money;
        System.out.println("Payment successfully processed!");
    }

    public void withdrawMoney(float money){
        payment(money);
    }
    public void payBill(float money) {
        payment(money);
    }
    public void overdraftUsage(){
        if(useOverdraft){
            System.out.println("This account is using a special check.");
            return;
        }
        System.out.println("This account is not using special checks.");
    }


}
