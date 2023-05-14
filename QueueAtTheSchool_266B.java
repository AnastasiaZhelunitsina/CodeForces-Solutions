import java.util.Scanner;

public class QueueAtTheSchool_266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        int time = sc.nextInt();
        sc.nextLine();
        StringBuilder queue = new StringBuilder(sc.nextLine());
        sc.close();

        for (int i = 0; i < time; i++) {
            for (int j = 0; j < queue.length() - 1; j++) {
                if (queue.charAt(j) == 'B' && queue.charAt(j + 1) == 'G') {
                    queue.setCharAt(j, 'G');
                    queue.setCharAt(j + 1, 'B');
                    j++;
                }
            }
        }
        System.out.println(queue);

    }
}
