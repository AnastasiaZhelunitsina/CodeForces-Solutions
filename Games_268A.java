import java.util.Scanner;

public class Games_268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }
        sc.close();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (left[i] == right[j]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
