package arrays2;

public class P16m6 {

  public static void main(String[] args) {
    int m[][] = {
      { 139, 532, 263, 6243, 6243, 6246 },
      { 62364, 4623, 6243, 6423, 6423, 6423 },
      { 5734, 176, 246, 413, 63416, 164334 },
      { 51346, 14362563, 32, 51254, 3256, 1234 },
      { 311523, 6253, 325, 635, 7768, 32 },
    };
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 6; j++) {
            System.out.print(m[i][j] + " ");
        }
        System.out.print('\n');
    }
  }
}
