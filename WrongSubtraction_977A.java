import java.util.Scanner;

public class WrongSubtraction_977A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        sc.close();
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        for (int i = 0; i < k; i++) {
            int temp = n % 10;
            if (temp != 0) {
                n -= 1;
            } else {
                n /= 10;
            }
        }
        System.out.println(n);
    }
}
