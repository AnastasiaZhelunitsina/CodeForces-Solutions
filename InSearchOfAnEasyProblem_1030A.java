import java.util.Scanner;

public class InSearchOfAnEasyProblem_1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] opinions = sc.nextLine().split(" ");
        sc.close();
        boolean flag = true;
        for (String answer : opinions) {
            if (flag) {
                if (Integer.parseInt(answer) == 1) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("EASY");
        } else {
            System.out.println("HARD");
        }
    }
}
