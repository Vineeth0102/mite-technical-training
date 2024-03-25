/*
 
Given two int values a and b. Check a and b are primes are not. If a and b are primes then check if the sum of a and b is a prime or not. If the prime returns true. Else return false.
SumPrime(2,3) —> true.
SumPrime(7,11) —> true.
 SumPrime(3,7) —> false
SumPrime(8,11) → false

*/

import java.util.*;

public class tech12 {
    public static void isPrime(int num){
        int flag = 0;
        for(int i = 2 ;i<num ; i++){
            if(num%i == 0 ){
                flag ++;
            }
        }
        if (flag != 0){
            System.out.println("false");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        isPrime(num1);
        isPrime(num2);
        isPrime(num2+num1);
        System.out.println("true");
        sc.close();
    }
}
