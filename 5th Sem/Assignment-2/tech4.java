/*You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10 */


import java.util.Scanner;

public class tech4{
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three number : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if (num1 == num2 && num2 == num3 && num3 == num1){
            System.out.println("Your Lottery Score is : "+20);
        }else if(num1 != num2 && num2 != num3 && num3 != num1){
            System.out.println("Your Lottery Score is : "+0);
        }else{
            System.out.println("Your Lottery Score is : "+10);
        }
        sc.close();
    }
}
