import java.util.Scanner;

public class NextRound_158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] buff = sc.nextLine().split(" ");
        int n = Integer.parseInt(buff[0]);
        int k = Integer.parseInt(buff[1]);
        String[] tempScore = sc.nextLine().split(" ");
        sc.close();

        int counter = 0;

        for (int i = 0; i < tempScore.length; i++) {
            String score = tempScore[i];
            if (Integer.parseInt(score) > 0 && Integer.parseInt(score) >= Integer.parseInt(tempScore[k - 1])) {
                counter++;
            }

        }
        System.out.println(counter);
    }
}
