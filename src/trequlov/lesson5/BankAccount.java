package trequlov.lesson5;

public class BankAccount {
    public static int bankId;
    private String name;
    private double balance;
    public double summa;

    public BankAccount(String name, double balance, double summa)
    {
        System.out.println("Welcome to our \"international Bank of Azerbaijan\"");
        this.name = name;
        this.balance = balance;
        this.summa = summa;
        bankId++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double accountReplenishment() {
        balance = getBalance() + summa;
        return balance;
    }

    public double accountWithdrawal() {
       balance = getBalance() - summa;
        return balance;
    }

    public void showInfo() {
        System.out.println("Bank ID: " + bankId + " name: " + getName() +','+ " balance: " + getBalance()+'.');
    }
}
