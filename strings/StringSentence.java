package strings;

import java.util.Scanner;

public class StringSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence please [no digits or special characters please ;)]: ");
        String s = sc.nextLine();
        int nL = 0;
        int nW = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                nL++;
            } else {
                nW++;
            }
        }
        int nWA = nW + 1;
        System.out.println("Number of words = " + nWA + ".");
        System.out.println("Number of letters = " + nL + ".");
    }
}
