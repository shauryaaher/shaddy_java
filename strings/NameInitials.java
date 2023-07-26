package strings;

import java.util.Scanner;

public class NameInitials {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String s = sc.nextLine();

		char f = s.charAt(0);
		System.out.print(f);
		char c;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				c = s.charAt(i + 1);
				System.out.println(c);		
			}
		}
	}
}
