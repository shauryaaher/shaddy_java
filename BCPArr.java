import java.util.Scanner;

public class BCPArr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i = 0;
            int p1 = 0;
            int p2 = 0;
            int phy[] = new int[4];
            int chem[] = new int[4];
            int bio[] = new int[4];
            for (i = 0; i < 4; i++) {
                System.out.print("Enter the marks scored in Physics: ");
                phy[i] = sc.nextInt();
                System.out.print("Enter the marks scored in Chemistry: ");
                chem[i] = sc.nextInt();
                System.out.println("Enter the marks scored in Biology: ");
                bio[i] = sc.nextInt();
            }
            for (i = 0; i < 4; i++) {
                if (phy[i] + chem[i] + bio[i] / 3 >= 80) {
                    
                    p1++;
                }
                if (phy[i] + chem[i] + bio[i] / 3 <= 34) {
                    
                    p2++;
                }
            }
            System.out.println("Number of students getting getting equal to or more than 80%: " + p1);
            System.out.println("Number of students getting getting equal to or less than 34%: " + p2);
        }
    }
}
