package school;

public class P19MN {

  public static void main(String[] args) {
    int M[][] = { { -1, 0, 2 }, { -3, -1, 6 }, { 4, 3, -1 } };
    int M_and_N[][] = { { -6, 9, 4 }, { 4, 5, 0 }, { 1, -2, -3 } };
    int N[][] = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        N[i][j] = M_and_N[i][j] - M[i][j];
        System.out.print(N[i][j] + " ");
      }
      System.out.println();
    }
  }
}
