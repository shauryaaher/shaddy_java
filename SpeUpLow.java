public class SpeUpLow {
    public static void main(String[] args) {
        String s = "KAPILDEV@83";
        int counta = 0, countb = 0, countc = 0;
        for (int i = 0; i <= s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                counta++;
            } else if (ch >= '0' && ch <= '9') {
                countb++;
            } else {
                countc++;
            }
            System.out.println("Alphabets: " + counta);
            System.out.println("Numbers: " + countb);
            System.out.println("Special characters:" + countc);
        }
    }
}
