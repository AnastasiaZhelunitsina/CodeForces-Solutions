import java.util.*;

public class Dragons_230A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strengthKirito = sc.nextInt();
        int quantityDragons = sc.nextInt();
        Map<Integer, Integer> dragons = new HashMap<>();
        for (int i = 0; i < quantityDragons; i++) {
            int strength = sc.nextInt();
            int bonus = sc.nextInt();
            dragons.put(strength, dragons.getOrDefault(strength, 0) + bonus);
        }

        boolean victory = true;

        List<Map.Entry<Integer, Integer>> sortedDragons = new ArrayList<>(dragons.entrySet());
        sortedDragons.sort(Map.Entry.comparingByKey());

        for (Map.Entry<Integer, Integer> dragon : sortedDragons) {
            if (strengthKirito > dragon.getKey()) {
                strengthKirito += dragon.getValue();
            } else {
                victory = false;
                System.out.println("NO");
                break;
            }
        }
        if (victory == true) {
            System.out.println("YES");
        }
    }
}
