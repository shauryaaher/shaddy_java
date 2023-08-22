import java.util.Scanner;

public class HcfLcm {
    private int a;
    private int b;
    HcfLcm(int x, int y) {
        a = x;
        b = y;
    }
    void calculate() {
        int x = a, y = b;
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        int hcf = x;
        int lcm = (a * b) / hcf;
        System.out.println("HCF = " + hcf + ".");
        System.out.println("LCM = " + lcm + ".");
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            HcfLcm n = new HcfLcm(x, y);
            n.calculate();
        }
    }
}
