import java.util.Scanner;

public class HQ9plus_133A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        sc.close();
        String answer = "NO";
        for (char element : str) {
            if (element == 'H' || element == 'Q' || element == '9') {
                answer = "YES";
                break;
            }
        }
        System.out.println(answer);
    }
}
