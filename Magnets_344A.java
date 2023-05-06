
import java.util.Scanner;

public class Magnets_344A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }
        sc.close();

        int counter = 1;

        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] != sequence[i + 1]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}