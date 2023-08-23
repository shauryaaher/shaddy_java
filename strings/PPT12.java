package strings;

import java.util.Scanner;

public class PPT12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence having the word 'blue' and this program will replace it with 'red': ");
        String s = sc.nextLine();
        String uppercase = s.toUpperCase();
        String replaced = uppercase.replaceAll("BLUE", "RED");
        System.out.println("New string: " + replaced);
        sc.close();
    }
}
