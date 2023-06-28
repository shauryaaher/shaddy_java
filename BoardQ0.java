import java.util.Scanner;

// Accept values in a 3 x 3 array and check if it's a special array.
// A special array is one in which the sum of even elements = sum of odd elements.
// Example ~ a[][] = {{4, 5, 6}, {5, 3, 2}, {4, 2, 5}}

public class BoardQ0 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[][] = new int[3][3];
    for (byte i = 0; i < 3; i++) {
      for (byte j = 0; j < 3; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    
  }
}
