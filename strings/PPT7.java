package strings;

import java.util.Scanner;

public class PPT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        String upS = s.toUpperCase();
        String result = upS.replaceAll("[AEIOU]", "*");
        System.out.println(result);
        sc.close();
    }
}
