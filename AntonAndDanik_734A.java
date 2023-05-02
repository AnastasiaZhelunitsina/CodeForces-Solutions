import java.util.Scanner;

public class AntonAndDanik_734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[] victories = sc.nextLine().toCharArray();
        sc.close();


        int cntAnton = 0;
        int cntDanik = 0;

        for (char winner : victories) {
            if (winner == 'A') {
                cntAnton++;
            } else {
                cntDanik++;
            }
        }

        if (cntAnton > cntDanik) {
            System.out.println("Anton");
        } else if ((cntDanik > cntAnton)) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
