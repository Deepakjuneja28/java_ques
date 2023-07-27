interface BankAccount {

    public void deposit(int amount);

    public void withdraw(int withdraw_amount);
}

class CheckingAccount implements BankAccount {
    int amount;
    int balance;
    int withdraw_amount;

    public void deposit(int amount) {

        balance = amount + balance;
        System.out.println("The deposited amount :" + balance);

    }

    public void withdraw(int withdraw_amount) {
        if (balance < withdraw_amount) {
            System.out.println("Insufficent balance");
        } else {
            balance = balance - withdraw_amount;
            System.out.println("The withdraw amount: " + withdraw_amount);
            System.out.println("The remaining balance : " + balance);
        }
    }
}

public class BankQues {
    public static void main(String[] args) {
        CheckingAccount c1 = new CheckingAccount();
        c1.deposit(50000);
        c1.withdraw(10000);
    }
}
