/*
 
Write a simple ATM Program to display the following options and perform the user-selective operation until the user exits from the program.
· Initial account pin is 1234 and the balance of the user is 0.
· Read the PIN from the user and if it matches then print and execute the following operations as per user selection.
1. Deposit
2. Withdraw
3. Balance enquiry
4. PIN change
5. Exit
· Return the total available balance after the deposit.
· Return the total available balance after the withdrawal.
· Return the total available balance after the Balance check.
· Return PIN Change after the pin change operation.
Transaction(1) : input: 5000 output:5000

*/

import java.util.*;

public class tech11 {
    public static void main(String[] args) {
        int org_pin = 1234, amount = 0,choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome user please enter your PIN to continue : ");
        int ref_pin = sc.nextInt();
        if (ref_pin != org_pin){
            System.out.print("Invalid Password");
            System.exit(0);
        }
        else{
            do{
                System.out.println("\n\nMenu\n1.Deposit\n2.Withdraw\n3.Balance Enquiry\n4.PIN change\n5.Exit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1: System.out.print("Enter the amount you want to deposit : ");
                            amount += sc.nextInt();
                            System.out.println("Amount has been deposited sucesfully");
                            break;

                    case 2: System.out.print("Enter the amount you want to widthraw : ");
                            int check_amount = sc.nextInt();
                            if (check_amount>amount){
                                System.out.println("Insaficent balance ");
                            }
                            else{
                                System.out.println("Amount has been widthrawed sucesfully");
                                amount -= check_amount;
                            }
                            break;

                    case 3 : System.out.println("The balace of the account : "+amount);
                            break;

                    case 4: System.out.print("Enter the new PIN : ");
                            ref_pin = sc.nextInt();
                            System.out.print("Re-Enter the new PIN : ");
                            if (ref_pin != sc.nextInt()){
                                System.out.println("Your PIN doesnt match");
                            }
                            else{
                                org_pin = ref_pin;
                                System.out.println("PIN changed sucessfully");
                            }
                            break;
                    case 5 : System.out.println("Exiting succesfully");
                             break;
                    default: System.out.println("Invalid Choice");
                        break;
                }
            }while(choice != 5);
        }
        sc.close();
    }   
}
