package day_1;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1);
        BankAccount.depositCash(200.232);
        BankAccount.printInfo();
        BankAccount.withdrawCash(100);
        BankAccount.printInfo();

    }
}
