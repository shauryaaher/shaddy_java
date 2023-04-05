import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		try (Scanner i = new Scanner(System.in)) {
			System.out.print("Enter  a character: ");
			char c = i.next().charAt(0);
			int ch = (int) c;
			int newCh = ch + 15;
			char o = (char) newCh;
			System.out.print(o);
		}
	}
}
