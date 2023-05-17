import java.util.Scanner;

public class StringTask_118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        sc.close();
        StringBuilder result = new StringBuilder();
        String ao ="aoyeui";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (ao.indexOf(letter) == -1) {
                result.append("." + letter);
            }
        }
        System.out.println(result);

    }
}
