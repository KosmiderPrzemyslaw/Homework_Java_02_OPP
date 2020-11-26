package day_1;

public class BankAccount {
    private int number;
    private float cash = 0;

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public float getCash() {
        return this.cash;
    }

    void depositCash(double amount) {
        if (amount > 0) {
            this.cash += amount;
        }
    }

    public double withdrawCash(double amount) {

        if (amount > 0 && amount <= cash) {
            this.cash -= amount;
            return cash;
        } else return cash;
    }

    public String printInfo() {

        return String.format("Numer konta: %s, stan konta: %s", this.number, this.cash);
    }
}
