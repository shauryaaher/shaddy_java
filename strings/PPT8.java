package strings;

import java.util.Scanner;

public class PPT8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a title and this program will provide you with an acronym: ");
            String s = sc.nextLine();
            String[] rep = s.split(" ");
            char initials[] = new char[rep.length];
            int i = 0;
            for (i = 0; i < rep.length; i++) {
                initials[i] = rep[i].charAt(0);
            }
            for (i = 0; i < rep.length; i++) {
                System.out.print(initials[i] + ".");
            }
            sc.close();
        }
    }
}
