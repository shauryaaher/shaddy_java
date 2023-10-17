import java.util.Scanner;

public class HcfLcm {
    private int a, b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        HcfLcm instance = new HcfLcm(x, y);
        instance.calculate();
    }
    HcfLcm(int x, int y) {
        a = x;
        b = y;
    }
    private void calculate() {
        int first = a, second = b;
        while (second != 0) {
            int t = second;
            second = first % second;
            first = t;
        }
        int hcf = first;
        int lcm = (a * b) / hcf;
        System.out.println("HCF = " + hcf + ".");
        System.out.println("LCM = " + lcm + ".");
    }
}
