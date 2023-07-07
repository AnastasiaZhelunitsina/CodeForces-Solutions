import java.util.Scanner;

public class ChatRoom_58A {
    static final String WORD = "hello";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greeting = sc.nextLine();
        sc.close();
        System.out.println(solution(greeting));
    }

    static String solution(String str) {

        int from = 0;
        for (int i = 0; i < WORD.length(); i++) {
            int index = str.indexOf(WORD.charAt(i), from);
            if (index < 0) {
                return "NO";
            }
            from = index + 1;
        }

        return "YES";

    }


}
