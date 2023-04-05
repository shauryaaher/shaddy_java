import java.util.Scanner;

public class Student {
    String name;
    short age;
    short score;
    String res;
    public static void main(String[] args) {
        Student s = new Student();
        s.accept();
        s.allocation();
        s.print();
    }
    
    void accept() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name.");
            name = sc.nextLine();
            System.out.println("Enter your age.");
            age = sc.nextShort();
            System.out.println("Enter your score.");
            score = sc.nextShort();
        }
    }
    void allocation() {
        if (score >= 300) {
            res = "Science and computers.";
        } else if (score >= 200 && score < 300) {
            res = "Commerce and computers.";
        } else if (score >= 75 && score < 200) {
            res = "Arts and animation.";
        } else {
            res = "Try again :(";
        }
    }
    void print() {
        System.out.println(res);
    }
}