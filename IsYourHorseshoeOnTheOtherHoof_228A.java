import java.util.HashSet;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof_228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> onHand = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            onHand.add(sc.nextInt());
        }
        sc.close();
        System.out.println(4 - onHand.size());
    }
}
