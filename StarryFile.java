public class StarryFile {
    public static void main(String[] args) {
        final byte lines = 5;
        for (byte i = 1; i <= 5; i++) {
            for (byte j = 1; j <= (lines - i); j++) {
                System.out.print("*");
            }
            System.out.println(i);
        }
    }
}
