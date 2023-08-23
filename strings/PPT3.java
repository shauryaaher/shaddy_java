package strings;

import java.util.Scanner;

public class PPT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        String[] words = name.split(" ");
        if (words.length != 3) {
            System.out.println("Enter exactly 3 words.");
        } else {
            char initials[] = { words[0].charAt(0), words[1].charAt(0), words[2].charAt(0) };
            for (byte i = 0; i < 3; i++) {
                System.out.print(initials[i] + " ");
            }
        }

        sc.close();
    }
}
