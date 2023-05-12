import java.util.Scanner;

public class VasyaTheHipster_581A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int blue = sc.nextInt();
        sc.close();
        int sum = red + blue;
        int different = Math.min(red, blue);
        int similar = (sum - (different * 2)) / 2;
        System.out.print(different + " " + similar);
    }
}
