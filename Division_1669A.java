import java.util.Scanner;

public class Division_1669A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(division(sc.nextInt()));
        }
        sc.close();
    }

    static String division(int n) {
        if (n <= 1399) {
            return "Division 4";
        } else if (n <= 1599) {
            return "Division 3";
        } else if (n <= 1899) {
            return "Division 2";
        } else {
            return "Division 1";
        }
    }
}
