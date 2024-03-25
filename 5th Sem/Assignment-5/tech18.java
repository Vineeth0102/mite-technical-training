/*

Write a program to implement the following Bus Ticket scenario. 
Read From stage number and To stage number.
Read the number of adult and children passengers.
Calculate the number of stages they are traveling.
Calculate adult cost @ Rs.10 per passenger per stage.
Calculate child cost @ Rs.5 per passenger per stage.
Find total ticket cost.
Find the discount of the ticket as follows:
If adults>=5 calculate a discount of 20% on ticket cost.
else If adults==4 calculate a discount of 15% on ticket cost.
else If adults==3 calculate a discount of 10% on ticket cost.
else If adults==2 calculate a discount of 5% on ticket cost.
else calculate a discount of 0% on ticket cost.
Then find the ticket cost after discount.
And also find the service charge of 5% on ticket cost.
Find the total ticket cost and display the ticket cost.

 */

import java.util.*;

public class tech18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter From stage number:");
        int fromStage = sc.nextInt();

        System.out.println("Enter To stage number:");
        int toStage = sc.nextInt();

        System.out.println("Enter number of adult passengers:");
        int adultPassengers = sc.nextInt();

        System.out.println("Enter number of children passengers:");
        int childPassengers = sc.nextInt();

        int totalStages = Math.abs(toStage - fromStage);

        double adultCostPerStage = 10.0;
        double childCostPerStage = 5.0;

        double totalAdultCost = adultPassengers * totalStages * adultCostPerStage;
        double totalChildCost = childPassengers * totalStages * childCostPerStage;

        double totalTicketCost = totalAdultCost + totalChildCost;

        double discount = 0.0;
        if (adultPassengers >= 5) {
            discount = 0.20;
        } else if (adultPassengers == 4) {
            discount = 0.15;
        } else if (adultPassengers == 3) {
            discount = 0.10;
        } else if (adultPassengers == 2) {
            discount = 0.05;
        }

        double discountAmount = totalTicketCost * discount;
        double ticketCostAfterDiscount = totalTicketCost - discountAmount;
        double serviceCharge = ticketCostAfterDiscount * 0.05;

        double totalTicketCostAfterServiceCharge = ticketCostAfterDiscount + serviceCharge;

        System.out.println("Total Ticket Cost before discount: Rs. " + totalTicketCost);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Ticket Cost after discount: Rs. " + ticketCostAfterDiscount);
        System.out.println("Service Charge: Rs. " + serviceCharge);
        System.out.println("Total Ticket Cost after service charge: Rs. " + totalTicketCostAfterServiceCharge);
        sc.close();
    }
}
