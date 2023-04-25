import java.util.Scanner;

public class UppercaseCV {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println(
        "Enter 5 letters. Press the enter key after entering a letter."
      );
      byte num = 0;
      for (byte i = 0; i < 5; i++) {
        char c = sc.next().charAt(0);
        if (
          c == 'a' ^
          c == 'A' ^
          c == 'e' ^
          c == 'E' ^
          c == 'i' ^
          c == 'I' ^
          c == 'o' ^
          c == 'O' ^
          c == 'u' ^
          c == 'U'
        ) {
          num++;
        }
      }
      int cNum = 5 - num;
      System.out.println("Number of vowels = " + num);
      System.out.println("Number of consonants = " + cNum);
    }
  }
}
