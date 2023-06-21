import java.util.Scanner;

public class BoringApartments_1433A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(pressedDigits(sc.nextInt()));
        }
        sc.close();
    }

    static int pressedDigits(int n) {
        int counter = 0;
        int iterations = n % 10;
        for (int i = 1; i <= iterations; i++) {
            String result = "";
            for (int j = 1; j <= 4; j++) {
                result += String.valueOf(i);
                counter += result.length();
                if (Integer.parseInt(result) == n) {
                    break;
                }
            }

        }
        return counter;
    }
}
