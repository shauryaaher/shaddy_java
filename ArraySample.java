public class ArraySample {
    public static void main(int[] m) {
        int p, sum = 0;
        p = m.length;
        for (int i = 0; i < p; i++) {
            sum = sum + m[i];
            System.out.println("The sum of the array elements = " + sum);
        }
    }
}