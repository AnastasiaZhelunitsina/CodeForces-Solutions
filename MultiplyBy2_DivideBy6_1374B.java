import java.util.Scanner;

public class MultiplyBy2_DivideBy6_1374B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {

            System.out.println(solution(sc.nextInt()));
        }
        sc.close();
    }

    static int solution(int n) {

        int divide2 = 0;
        while (n % 2 == 0) {
            divide2++;
            n /= 2;
        }

        int divide3 = 0;
        while (n % 3 == 0) {
            divide3++;
            n /= 3;
        }

        return (n == 1 && divide2 <= divide3) ? (divide3 - divide2) + divide3 : -1;
    }
}
