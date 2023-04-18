package Bankaccount;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount Murielaccount = new BankAccount();
      

        System.out.println(Murielaccount.deposit(7500, "checking"));
        System.out.println(Murielaccount.deposit(11600, "savings"));
        System.out.println(Murielaccount.withdraw(800, "checking"));
        System.out.println(Murielaccount.withdraw(100, "savings"));
        System.out.println(Murielaccount.getCheckingBalance());
        System.out.println(Murielaccount.getSavingsBalance());
        Murielaccount.printTotalBalance();

    }
}