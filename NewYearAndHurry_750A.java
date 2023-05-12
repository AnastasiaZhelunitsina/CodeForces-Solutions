import java.util.Scanner;

public class NewYearAndHurry_750A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tasks = sc.nextInt();
        int travelTime = sc.nextInt();
        sc.close();
        int timeBeforeParty = 4 * 60;
        int duration = travelTime;
        int counter = 0;
        for (int i = 1; i <= tasks; i++) {
            duration += i * 5;
            if (duration <= timeBeforeParty) {
                counter++;
            } else {
                break;
            }
        }
        System.out.println(counter);
    }
}
