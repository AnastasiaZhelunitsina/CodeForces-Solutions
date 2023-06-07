import java.util.*;

public class SpyDetected_1512A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int[] array = new int[t];
            for (int j = 0; j < array.length; j++) {
                array[j] = sc.nextInt();
            }
            System.out.println(solution(array));
        }
        sc.close();
    }

    static int solution(int[] array) {
        Map<Integer, List<Integer>> values = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!values.containsKey(array[i])) {
                values.put(array[i], new ArrayList<>());
            }
            values.get(array[i]).add(i + 1);
        }
        int answer = values.values().stream()
                .filter(indices -> indices.size() == 1)
                .findAny()
                .get()
                .get(0);
        return answer;
    }
}
