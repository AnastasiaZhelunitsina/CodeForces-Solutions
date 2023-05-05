import java.util.Scanner;

public class VanyaAndFence_677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = sc.nextInt();
        int[] friendsHeight = new int[n];
        for (int i = 0; i < friendsHeight.length; i++) {
            friendsHeight[i] = sc.nextInt();
        }
        int width = 0;
        for (int friend : friendsHeight) {
            if (friend > height) {
                width += 2;
            } else {
                width += 1;
            }
        }
        System.out.println(width);
    }
}
