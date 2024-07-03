package trequlov.lesson5;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Alex", 234.56, 30.00);
        ba.accountReplenishment();
        ba.accountReplenishment();
        ba.accountWithdrawal();
        ba.showInfo();
        BankAccount ba2 = new BankAccount("Mamed", 1256.74, 75.00);
        ba2.accountWithdrawal();
        ba2.showInfo();
        ba2.accountReplenishment();
        ba2.showInfo();

    }
}