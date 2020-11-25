package day_1;

public class BankAccount {
    private static int number;
    private static double cash = 0;

    BankAccount(int number) {
        BankAccount.number = number;
    }

    public static int getNumber() {
        return number;
    }

    public static double getCash() {
        return cash;
    }

    public static void depositCash(double amount) {
        if (amount > 0) {
            double cash = getCash();
            cash += amount;
        }
    }

    public static double withdrawCash(double amount) {
        double cash = getCash();
        if (cash > amount) {
            return cash -= amount;
        } else {
            System.out.println("No found on bank account");
        }
        return cash;
    }

    public static String printInfo() {

        return "Count number: " + getNumber() +
                "Available founds: " + getCash();
    }
}
