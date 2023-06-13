import java.util.Scanner;

public class DislikeOfThrees_1560A {

    public static int sequence(int num) {
        int a = 1;
        int counter = 0;
        while (true) {
            if (a % 3 != 0 && a % 10 != 3) {
                counter++;
                if (counter == num) {
                    return a;
                }
            }
            a++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            System.out.println(sequence(a));
        }
    }
}
