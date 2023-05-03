import java.util.Scanner;

public class Translation_41A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();
        StringBuilder reverse = new StringBuilder(t);
        reverse.reverse();
        if (s.equalsIgnoreCase(reverse.toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
