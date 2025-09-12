package BasicJava;

import java.util.Scanner;

public class AmrstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check if its Armstrong");
        int armstrongNumber = sc.nextInt();
        isArmstrong(armstrongNumber);
    }

    static void isArmstrong(int lastNumber) {
        int originalNumber = 0;
        for (int i = 1; i<=lastNumber; i++) {
            int sum = 0;
            originalNumber = i;
            int n = String.valueOf(i).length();

            int temp = i;
            while (temp > 0) {
                int cube = temp % 10;
                sum += Math.pow(cube, n);
                temp = temp / 10;
            }
            if (originalNumber == sum) {
                System.out.print(sum + " ");
            }
        }

    }
}
