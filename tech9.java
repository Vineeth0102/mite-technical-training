    /*
    
    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    
    in1020(12, 99) → true
    in1020(21, 12) → true
    in1020(8, 99) → false

    */
    import java.util.*;

    public class tech9 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the two numbers : ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println((num1 > 9 && num1 < 21) || (num2 > 9 && num2 < 21));
            sc.close();
        }
    }