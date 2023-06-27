import java.util.Scanner;

public class CodeforcesChecking_1791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(answer(sc.next()));
        }
        sc.close();
    }

    static String answer(String str) {
        String codeforces = "codeforces";
        if(codeforces.contains(str)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
