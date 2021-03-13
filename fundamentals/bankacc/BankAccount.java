import java.util.Random;
class public BankAccount{
    private String an;
    private double cb=0;
    private double sb=0;
    public static int numberOfAccount = 0;
    public static int totalmoney = 0;
    public BankAccount(){
        this.an=BankAccount.rand();
        this.cb=cb;
        this.an=sb;
        totalmoney+=sb;
        numberOfAccount+=1;
    }

    private static String rand() {
        String number = "";
        Random c = new Random();
        for(int i = 0; i < 10; i++) {
            number += r.nextInt(10);
        }
        return number;
    }

    public double getcb() {
        return this.cb;
    }

    public double getsb() {
        return this.sb;
    }

    public void depositsaving(double money, String type) {
        if(type.equals("savings"))
            this.savingsBalance += amount;
        else if(type.equals("checking"))
            this.checkingBalance += amount;
        BankAccount.totalHoldings += amount;
    }
    public void withdrawMoney(double amount, String type) {
        boolean total = false;
        if(type.equals("savings")) {
            if(this.sb - amount >= 0) {
                can = true;
                this.sb -= amount;
            }
        }
        else if(type.equals("checking")) {
            if(this.cb - amount >= 0) {
                can = true;
            this.cb -= amount;
            }
        }
        if(can) {
            BankAccount.totalHoldings -= amount;
            }
        }
    public void displayAccountBalance() {
        System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
        }

    public static void main(String[] args) {
        BankAccount user = new BankAccount();
        user.depositMoney(100.49, "checking");
        user.depositMoney(3.00, "savings");
        user.displayAccountBalance();

        System.out.println(BankAccount.totalHoldings);

        user.withdrawMoney(50, "checking");
        user.withdrawMoney(50, "savings");
        user.displayAccountBalance();

        System.out.println(BankAccount.totalHoldings);
    }
}