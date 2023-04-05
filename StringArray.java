import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 5 characters.");
            String cha = sc.next();
            char chr[] = cha.toCharArray();
            final char c0 = Character.toUpperCase(chr[0]);
            final char c1 = Character.toUpperCase(chr[1]);
            final char c2 = Character.toUpperCase(chr[2]);
            final char c3 = Character.toUpperCase(chr[3]);
            final char c4 = Character.toUpperCase(chr[4]);
            char chrUpperCase[] = {c0, c1, c2, c3, c4};
            String chrUpperCaseString = String.valueOf(chrUpperCase);
            System.out.print(chrUpperCaseString);
        }
    }
}
