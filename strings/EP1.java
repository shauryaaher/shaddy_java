package strings;

import java.util.Scanner;

public class EP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something without whitespaces: ");
        String in = sc.next();
        char arr[] = in.toCharArray();
        for (int i = 0; i < in.length(); i++) {
            System.out.println(arr[i]);
        }
    }
}
