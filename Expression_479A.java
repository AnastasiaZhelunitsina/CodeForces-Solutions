import java.util.Scanner;

public class Expression_479A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int maximum = 0;
        if ((a + b + c) > maximum) {
            maximum = a + b + c;
        }
        if ((a + b * c) > maximum) {
            maximum = a + b * c;
        }
        if ((a * b * c) > maximum) {
            maximum = a * b * c;
        }
        if ((a * b + c) > maximum) {
            maximum = a * b + c;
        }
        if (((a + b) * c) > maximum) {
            maximum = (a + b) * c;
        }
        if ((a * (b + c)) > maximum) {
            maximum = a * (b + c);
        }
        System.out.println(maximum);
    }
}
