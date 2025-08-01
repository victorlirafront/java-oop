package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public  Account (int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public  Account (int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }
    public String getHolder(){
        return this.holder;
    }

    public String setHolder(int number){
        return this.holder;
    }

    public int getNumber(){
        return this.number;
    }

    public int getBalance(){
        return this.number;
    }

    public void deposit (double amount){
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
