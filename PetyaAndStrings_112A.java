import java.util.Scanner;

public class PetyaAndStrings_112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine().toLowerCase();
        String secondLine = sc.nextLine().toLowerCase();
        sc.close();
        int result = 0;
        for (int i = 0; i < firstLine.length(); i++) {
            if (firstLine.charAt(i) == secondLine.charAt(i)) {
                continue;
            } else if (firstLine.charAt(i) < secondLine.charAt(i)) {
                result = -1;
                break;
            } else if (firstLine.charAt(i) > secondLine.charAt(i)) {
                result = 1;
                break;
            }
        }
        System.out.println(result);
    }
}
