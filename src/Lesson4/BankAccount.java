package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    double popolnenieScheta(double summa) {
        balance += summa;
        return balance;
    }

    double snyatieSoScheta(double summa) {
        balance -= summa;
        return balance;
    }

    void showInfo() {
        System.out.println("Баланс " + name + " составляет: " + balance + " деняк.");
    }
}

    class BankAccountTest {
        public static void main(String[] args) {

            Lesson4.BankAccount myAccount = new Lesson4.BankAccount();
            Lesson4.BankAccount yourAccount = new Lesson4.BankAccount();
            Lesson4.BankAccount hisAccount = new Lesson4.BankAccount();

            myAccount.id = 1;
            myAccount.name = "Nana";
            myAccount.balance = 12.36;
            myAccount.showInfo();
            myAccount.snyatieSoScheta(8.5);

            yourAccount.id = 2;
            yourAccount.name = "Polina";
            yourAccount.balance = 100_000;
            yourAccount.showInfo();
            yourAccount.popolnenieScheta(30000);

            hisAccount.id = 3;
            hisAccount.name = "Kirill";
            hisAccount.balance = 1_000_000_000;

            myAccount.showInfo();
            yourAccount.showInfo();
        }

    }

