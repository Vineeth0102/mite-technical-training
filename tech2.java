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