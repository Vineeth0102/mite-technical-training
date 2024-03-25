/*
 
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"

 */
import java.util.*;

public class tech13 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String : ");
    String word = sc.nextLine();
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    for(int i = 0; i < num ; i++ ){
        System.out.print(word);
    }
    sc.close();
   } 
}
