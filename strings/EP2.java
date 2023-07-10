package strings;

import java.util.Scanner;

public class EP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something without whitespaces: ");
        String str = sc.next();
        char arr[] = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (arr[i]) {
                case 'a':
                    sum++;
                    break;
                case 'A':
                    sum++;
                    break;
                case 'E':
                    sum++;
                    break;
                case 'e':
                    sum++;
                    break;
                case 'i':
                    sum++;
                    break;
                case 'I':
                    sum++;
                    break;
                case 'o':
                    sum++;
                    break;
                case 'O':
                    sum++;
                    break;
                case 'u':
                    sum++;
                    break;
                case 'U':
                    sum++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Number of vowels = " + sum + ".");
    }
}
