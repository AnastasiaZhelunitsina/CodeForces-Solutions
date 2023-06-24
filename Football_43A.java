import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Football_43A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] goals = new String[n];
        for (int i = 0; i < goals.length; i++) {
            goals[i] = sc.nextLine();
        }
        System.out.println(winner(goals));
    }

    static String winner(String[] array) {
        Map<String, Integer> counter = new HashMap<>();
        for (String name : array) {
            if (!counter.containsKey(name)) {
                counter.put(name, 1);
            } else {
                int value = counter.get(name);
                counter.put(name, value + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        String winner = "";
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
    }
}
