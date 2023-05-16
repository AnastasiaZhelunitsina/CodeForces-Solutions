import java.util.Scanner;

public class ILoveUsername_155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int unique = 0;
        int number = sc.nextInt();
        int max = number;
        int min = number;
        for (int i = 0; i < n - 1; i++) {
            int num = sc.nextInt();
            if (num < min) {
                unique++;
                min = num;
            } else if (num > max) {
                unique++;
                max = num;
            }
        }
        System.out.println(unique);
    }
}
