package prac;
// Write a program to accept a character and check the case (upper or lower), otherwise, check whether
// it is a digit or a special character.

import java.util.Scanner;

public class j0 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char c = sc.next().charAt(0);
            if(Character.isLetter(c) == true) {
                if (Character.isUpperCase(c) == true) {
                    System.out.println("This is an uppercase character.");
                } else if (Character.isLowerCase(c) == true) {
                    System.out.println("This is a lowercase character.");
                }
            } else if (Character.isDigit(c) == true) {
                System.out.println("This is a digit.");
            } else {
                System.out.println("This is a special character.");
            }
        }
    }
}
