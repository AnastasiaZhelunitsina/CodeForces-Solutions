import java.util.Scanner;

public class Bit282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            if (line.equals("++X")) {
                ++x;
            } else if (line.equals("X++")) {
                x++;
            } else if (line.equals("--X")) {
                --x;
            } else if (line.equals("X--")) {
                x--;
            }
        }
        sc.close();
        System.out.println(x);
    }
}
