package Day2;

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            
            // Convert number to array of digits
            String numStr = String.valueOf(num);
            int[] digits = new int[numStr.length()];
            for (int i = 0; i < numStr.length(); i++) {
                digits[i] = numStr.charAt(i) - '0';
            }
            
            // Reverse the array
            for (int i = 0; i < digits.length / 2; i++) {
                int temp = digits[i];
                digits[i] = digits[digits.length - 1 - i];
                digits[digits.length - 1 - i] = temp;
            }
            
            // Print the reversed number
            System.out.print("Reversed number: ");
            for (int digit : digits) {
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}
