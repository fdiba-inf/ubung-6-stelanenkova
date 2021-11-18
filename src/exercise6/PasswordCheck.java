package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid;

        do {
          System.out.println("Enter password: ");

          int digitCounter = 0;
          valid = true;

          String password = input.nextLine();

          for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
              valid = false;

            } else if (Character.isDigit(password.charAt(i))) {
              digitCounter++;
            } 
            
          }
          if (password.length() < 8) {
            valid = false;
          } else if (digitCounter < 2) {
            valid = false;
          }

        } while (!valid);

        

        System.out.println("Password valid!");
    }
}
