public class File {
    public static void main(String[] args) {
        for (byte i = 1; i <= 5; i++) {
            for (byte j = 1; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}