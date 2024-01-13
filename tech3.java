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
