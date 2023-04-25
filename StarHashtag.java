public class StarHashtag {
    public static void main(String[] args) {
        for (byte i = 1; i <= 5; i++) {
            for (byte j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print('\n');
        }
    }
}
