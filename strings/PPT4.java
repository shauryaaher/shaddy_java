package strings;

import java.util.Scanner;

public class PPT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first, middle, and last name. Press enter after doing so: ");
        String name = sc.nextLine();
        String[] nameParts = name.split(" ");
        String res = (nameParts.length != 3) ? "Enter only 3 words."
                : ("Your name: " + nameParts[2] + " " + nameParts[0] + " " + nameParts[1]);
        System.out.println(res);
        sc.close();
    }
}
