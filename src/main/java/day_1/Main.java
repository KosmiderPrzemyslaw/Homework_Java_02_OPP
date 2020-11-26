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


        Author author = new Author(1, "Jan", "Brzechwa", "Janu");
        Book book = new Book(1, "Pod zielonym ogórkiem", author);
        User user = new User(1, "Konrad", "Mostowiak");

        user.addBook(book);
        System.out.println(user.toString());

        book.setCurrentUser(user);
        System.out.println(book.toString());
    }
}
