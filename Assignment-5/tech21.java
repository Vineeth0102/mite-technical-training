/*
 
Given positive integer X. Print the nearest Armstrong number of given X.

NearestArmstrong(5) → 5
NearestArmstrong(99) → 153
NearestArmstrong(450) → 407
NearestArmstrong(1600)  → 1634

*/

import java.util.*;

public class tech21 {

    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;

        originalNum = num;

        for (originalNum = num; originalNum != 0; originalNum /= 10, ++n)
            ;

        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        return result == num;
    }

    public static int nearestArmstrong(int x) {
        if (isArmstrong(x)) {
            return x;
        }

        int smaller = x - 1;
        int larger = x + 1;

        while (true) {
            if (isArmstrong(smaller)) {
                return smaller;
            } else if (isArmstrong(larger)) {
                return larger;
            }
            smaller--;
            larger++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("nearest armstrong number is :" + nearestArmstrong(num));
        sc.close();
    }
}
