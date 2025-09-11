package BasicJava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        boolean ans = isPrime(number);
        System.out.println(ans);
    }

    static boolean isPrime(int prime) {
        if (prime<=1){
            return false;
        }
        int c = 2;
        while(c*c<=prime)
        {
            if(prime%c == 0){
                return false;
            }
            c++;
        }
        return c*c>prime;
    }
}
