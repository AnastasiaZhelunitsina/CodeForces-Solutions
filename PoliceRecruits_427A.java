import java.util.Scanner;

public class PoliceRecruits_427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int policeman = 0;
        int crime = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp > 0) {
                policeman += temp;
            } else {
                if (policeman > 0) {
                    policeman--;
                } else {
                    crime++;
                }
            }
        }
        sc.close();
        System.out.println(crime);

    }
}
