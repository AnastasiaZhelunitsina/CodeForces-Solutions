import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class IQTest_25A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        Set<Integer> even = new HashSet<>();
        Set<Integer> odd = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even.add(i + 1);
            } else {
                odd.add(i + 1);
            }
        }
        if (even.size() == 1) {
            Iterator iter = even.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
        }
        if (odd.size() == 1) {
            Iterator iter = odd.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
        }
    }
}