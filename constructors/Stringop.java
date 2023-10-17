import java.util.Scanner;

public class Stringop {
    private String str;
    Stringop() {
        str = null;
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        Stringop instance = new Stringop();
        instance.str = sc.nextLine();
        sc.close();
    }

    void encode() {
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; i++) {
                arr[j] = arr[j + 2];
            }
        }
        String newString = arr.toString();
        str = newString;
    }

    void print() {
        System.out.print("New string = " + str + ".");
    }
    public static void main(String[] args) {
        Stringop instance = new Stringop();
        instance.accept();
        instance.encode();
        instance.print();

    }
}
