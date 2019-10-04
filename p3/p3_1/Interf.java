// //  CREATED BY 'DK'
// //  DATE 06-08-2019

import java.util.Scanner;
interface Bank
{
    void deposit();
    void withdraw();
    void accountOpen();
    void deleteAccount();
}
public class Interf implements Bank {
    
    Scanner s = new Scanner (System.in);
    int acc_no = 1000, balance = 500, pin;
    String uName = new String();
    
    public void deposit()
    {
        System.out.println("Enter the amount to be deposited:");
        int x = s.nextInt();
        balance += x;
    }
    public void withdraw()
    {
        System.out.println("Enter the amount to be withdrawn:");
        int x = s.nextInt();
        balance -= x;
    }
    public void accountOpen()
    {
        System.out.println("***********************  Welcome to the Bank of DK  ***********************");
        acc_no++;
        System.out.println("1. Open new account\n2. Exit");
        int c = s.nextInt();
        if (c != 1) return;
        System.out.println("  Your account number is D000696969" + acc_no);
        System.out.println("  Your IFSC is DKB000" + acc_no);
        System.out.println("  Enter a PIN for your account:");
        s.nextInt();
        System.out.println("  Starting account balance: " + balance);
        takeInput();
    }
    public void deleteAccount()
    {
        balance = 0;
        pin = 0;
        accountOpen();
    }
    
    void takeInput()
    {
        int choice;
        do
        {
            System.out.println("\n  1. Deposit\n  2. Withdraw\n  3. Delete Account\n  4. Exit");
            choice = s.nextInt();
            switch (choice)
            {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deleteAccount();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("    Wrong input");
            }
        } while (choice != 4);
    }
    
    public static void main(String[] args) {
        Interf bnk = new Interf();
        bnk.accountOpen();
        
    }
}
