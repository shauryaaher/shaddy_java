package prac;
/* Write a program to enter a letter. 
Change the case of the input letter and display the new letter and its 
ASCII code. */

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a letter: ");
            char a = sc.next().charAt(0);
            if (Character.isLetter(a) == true) {
                if (Character.isUpperCase(a) == true) {
                    System.out.println(Character.toLowerCase(a) + ": ASCII(decimal) = " + (int)Character.toLowerCase(a));
                } else if (Character.isLowerCase(a) == true) {
                    System.out.println(Character.toUpperCase(a) + ": ASCII(decimal) = " + (int)Character.toUpperCase(a));
                }
            } else {
                System.out.println("Enter a letter please.");
            }
        }
    }
}
