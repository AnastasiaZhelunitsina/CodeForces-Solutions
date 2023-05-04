import java.util.Scanner;

public class GeorgeAndAccommodation_467A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b - a >= 2) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
