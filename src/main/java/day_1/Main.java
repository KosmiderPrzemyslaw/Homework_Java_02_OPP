package day_1;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1);
        bankAccount.depositCash(100);
        bankAccount.withdrawCash(2);
        bankAccount.printInfo();
        System.out.println(bankAccount.getCash());
        System.out.println(bankAccount.getNumber());
        System.out.println(bankAccount.printInfo());

    }
}
