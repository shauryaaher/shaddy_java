import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			char c;
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				c = in.next().charAt(0);
				sum = sum + (int)c;
			}
			System.out.print("Sum of the characters\t" + sum);
		}
	}
}
