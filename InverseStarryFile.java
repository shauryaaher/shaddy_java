public class InverseStarryFile {
    public static void main(String[] args) {
        final byte lines = 5;
        for (byte i = 1; i <= 5; i++) {
            for (byte j = 1; j <= (lines - i); j++) {
                System.out.print("*");
            }
            for (byte k = 1; k < i; k++) {
                System.out.print(i);
            }
            System.out.println(i);
        }
    }
}