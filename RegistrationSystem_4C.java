import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistrationSystem_4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> names = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            if (!names.containsKey(name)) {
                names.put(name, 0);
                System.out.println("OK");
            } else {
                int value = names.get(name);
                value++;
                System.out.println(name + value);
                names.put(name, value);
            }
        }
    }
}
