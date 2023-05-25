package prac;

import java.util.Scanner;

/* Write a Java program to accept a set of any 10 characters. Calculate and print the sum 
   of ASCII codes of the characters.
*/

public class j2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int s = 0;
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter a character: ");
                char c = sc.next().charAt(0);
                s += s + (int)c;
            }
            System.out.println("The sum of the decimal ASCII codes of the characters is: " + s + ".");
        }
    }
}
