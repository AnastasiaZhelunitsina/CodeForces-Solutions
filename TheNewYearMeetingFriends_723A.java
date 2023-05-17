import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends_723A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] distances = new int[3];
        for (int i = 0; i < distances.length; i++) {
            distances[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(distances);
        System.out.println((distances[1] - distances[0]) + (distances[2] - distances[1]));
    }
}
