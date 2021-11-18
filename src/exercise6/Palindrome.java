package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int reversedNumber = 0;
        int copiedNumber = number;

        while (copiedNumber > 0) {
          int nextDigit = copiedNumber % 10;
          reversedNumber = reversedNumber * 10 + nextDigit;
          copiedNumber = copiedNumber / 10;
        }

        if (reversedNumber == number) {
          System.out.println("Palindrome: true");
        } else {
          System.out.println("Palindrome: false");
        }
    

  
    }
}
