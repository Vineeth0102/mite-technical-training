/*Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1 */


import java.util.Scanner;

public class tech2{
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three number : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if (num1 == 13){
            System.out.println("Your lucky Sum is : "+0);
        }else if(num2 == 13){
            System.out.println("Your lucky Sum is : "+num1);
        }else if(num3 == 13){
            System.out.println("Your lucky Sum is : "+(num1+num2));
        }else{
            System.out.println("Your lucky Sum is : "+(num1+num2+num3));
        }
        sc.close();
    }
}
