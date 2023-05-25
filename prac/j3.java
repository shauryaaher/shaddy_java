package prac;

import java.util.Scanner;

/* Write a Java program to input 'n' number of characters. Find and display the number
   of uppercase and lowercase characters. Ensure none of the characters are digits or 
   special characters.
 */

public class j3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of characters you want to enter: ");
            int n = sc.nextInt();
            System.out.println("Now, enter " + n + " characters.");
            int uppercase = 0;
            int lowercase = 0;
            for (int i = 0; i < n; i++) {
                char c = sc.next().charAt(0);
                if (Character.isUpperCase(c) == true) {
                    uppercase++;
                } else {
                    lowercase++;
                }
            }
            System.out.println("The number of uppercase characters = " + uppercase + ".");
            System.out.print("The number of lowercase characters = " + lowercase + ".");
        }
    }
}
