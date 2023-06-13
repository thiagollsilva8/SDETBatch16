package class30;

import class29.BankAccount;

public class E07Methods {

    public static void main(String[] args) {

        E07Methods e07Methods = new E07Methods();
        BankAccount bankAccount = new BankAccount(20);
        e07Methods.print(bankAccount);
    }

    void print(BankAccount bankAccount) {
        bankAccount.withdraw(10);
    }
}
