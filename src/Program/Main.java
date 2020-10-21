package Program;

import Entities.Account;
import Exceptions.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter account data");

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        String holder = sc.next();

        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter amount for withdraw: R$");
        double amountWithdraw = sc.nextDouble();
        try {
            account.withdraw(amountWithdraw);
        } catch (AccountException e){
            System.out.println("Operação inválida: " + e.getMessage());
        }
        System.out.println("Saldo de: R$" + String.format("%.2f", account.getBalance()));

    }
}
