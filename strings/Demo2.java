package strings;

public class Demo2 {
    public static void main(String[] args) {
        String s = "SETHI IS DUMB AND SUS!";
        char c[] = new char[11];
        s.getChars(9, 20, c, 0);
        final String s0 = c.toString();
        System.out.println(s0);
    }
}
