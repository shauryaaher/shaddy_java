import java.util.Scanner;

class OverloadArea {
    private static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
    private static double area(int a, int b, int height) {
        double return_val = (1/2) * height * (a + b);
        return return_val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0, 1, or 2");
        byte choice = sc.nextByte();
        if (choice == 0) {
            System.out.println("Enter the sides of the triangle");
            double f = sc.nextDouble();
            double s = sc.nextDouble();
            double t = sc.nextDouble();
            sc.close();
            System.out.print(area(f, s, t));
        } else if (choice == 1) {
            System.out.println("Enter the parallel sides of the trapezium (integer only)");
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println("Enter the height of the trapezium");
            int height = sc.nextInt();
            sc.close();
            area(p, q, height);
        } else {
            System.out.print("Enter 0 or 1 only.");
            System.exit(0);
        }
    }
}
