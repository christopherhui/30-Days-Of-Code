import java.util.Scanner;

public class day25prime {
    static boolean isprime(int n)
    {
        // Corner cases
        if (n <= 1) return false;
        if (n <= 3) return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i=0;i < a;i++) {
            int n = scan.nextInt();
            if (isprime(n)) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
        }
    }
}
