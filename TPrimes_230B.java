import java.util.Arrays;
import java.util.Scanner;

public class TPrimes_230B {
    static final int LIMIT = 1000001;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(tPrime(sc.nextLong()) ? "YES" : "NO");
        }
        sc.close();
    }

    static boolean[] primes = primeArray();

    static boolean[] primeArray() {
        boolean[] primes = new boolean[LIMIT];
        primes[0] = false;
        primes[1] = false;
        Arrays.fill(primes, 2, primes.length, true);

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = 2 * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }

        }
        return primes;
    }

    static boolean tPrime(long n) {
        int sqrt = (int) Math.round(Math.sqrt(n));
        return (long) sqrt * sqrt == n && primes[sqrt] == true;
    }


}
