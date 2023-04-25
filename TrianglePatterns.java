public class TrianglePatterns {

  public static void main(String[] args) {
    for (byte i = 1; i <= 5; i++) {
      for (byte j = 9; j >= i; j -= 2) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
