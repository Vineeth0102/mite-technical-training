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