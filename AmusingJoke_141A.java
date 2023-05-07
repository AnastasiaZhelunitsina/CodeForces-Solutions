
import java.util.HashMap;
import java.util.Scanner;

public class AmusingJoke_141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] guest = sc.nextLine().toCharArray();
        char[] host = sc.nextLine().toCharArray();
        char[] letters = sc.nextLine().toCharArray();
        sc.close();
        HashMap<Character, Integer> guestAndHost = new HashMap<>();
        HashMap<Character, Integer> lettersCount = new HashMap<>();
        for (char symbol : guest) {
            if (!guestAndHost.containsKey(symbol)) {
                guestAndHost.putIfAbsent(symbol, 1);
            } else {
                int value = guestAndHost.get(symbol);
                guestAndHost.put(symbol, value + 1);
            }
        }
        for (char symbol : host) {
            if (!guestAndHost.containsKey(symbol)) {
                guestAndHost.putIfAbsent(symbol, 1);
            } else {
                int value = guestAndHost.get(symbol);
                guestAndHost.put(symbol, value + 1);
            }
        }
        for (char symbol : letters) {
            if (!lettersCount.containsKey(symbol)) {
                lettersCount.putIfAbsent(symbol, 1);
            } else {
                int value = lettersCount.get(symbol);
                lettersCount.put(symbol, value + 1);
            }
        }

        if (guestAndHost.equals(lettersCount)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
