/*

Write a Java program to store and display bank customer data by using the constructor overloading.
You can take id, name, acno, bal, email, phno are the data members and display(), deposite() and withdraw() as
methods.

*/

import java.util.*;

public class tech2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank cust1 = new Bank();
        System.out.print("Enter the name of the customer : ");
        cust1.name = sc.nextLine();
        System.out.print("Enter the Email of the customer : ");
        cust1.email = sc.nextLine();
        System.out.print("Enter the ID of the customer : ");
        cust1.id = sc.nextInt();
        System.out.print("Enter the Account Number of the customer : ");
        cust1.acno = sc.nextInt();
        System.out.print("Enter the Phone Number of the customer : ");
        cust1.phno = sc.nextLine();
        cust1.phno = sc.nextLine();
        System.out.print("Enter the Balance of the customer : ");
        cust1.bal = sc.nextInt();

        System.out.print("Enter the Amount you want to deposit : ");
        int val = sc.nextInt();
        cust1.deposite(val);

        System.out.print("Enter the Amount you want to withdraw : ");
        val = sc.nextInt();
        cust1.withdraw(val);

        sc.close();
    }

}

class Bank {
    int id, acno, bal;
    String name, email, phno;

    void display() {
        System.out.print("Name : " + name);
        System.out.print("Email : " + email);
        System.out.print("ID : " + id);
        System.out.print("Account Number : " + acno);
        System.out.print("Phone Number : " + phno);
        System.out.print("Balance : " + bal);
    }

    Bank() {
        id = 123;
        name = "abc";
        email = "abc@gmail.com";
        acno = 12345;
        bal = 10000;
        phno = "9988776655";
    }

    void deposite(int val) {
        bal += val;
        System.out.println("Balance : " + bal);
    }

    void withdraw(int val) {
        if (val > bal) {
            System.out.println("Insuffiecnt Balance ");
        }
        bal -= val;
        System.out.println("Balance : " + bal);
    }
}
