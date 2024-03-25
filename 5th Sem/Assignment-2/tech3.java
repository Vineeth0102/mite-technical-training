/*Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().

noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3 */


import java.util.Scanner;

public class tech3 {

    public static int noTeenSum(int num1, int num2, int num3) {
        num1 = fixTeen(num1);
        num2 = fixTeen(num2);
        num3 = fixTeen(num3);
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three number : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        int result = noTeenSum(num1,num2,num3);
        System.out.println("Sum after fixing teens: " + result);
        sc.close();
    }

    public static int fixTeen(int num) {
        if ((num > 12 && num < 15) || (num > 16 && num < 20)) {
            return 0;
        }
        return num;
    }
}
