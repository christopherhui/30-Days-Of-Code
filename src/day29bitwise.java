import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day29bitwise {

    public static Integer tobinary(int i) {
        return Integer.parseInt(Integer.toBinaryString(i));
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            int largest = 0;
            for (int i = 1; i < n + 1; i++) {
                tobinary(i);
                for (int j = i + 1; j < n + 1; j++) {
                    tobinary(j);
                    int temp = i & j;
                    if (temp > largest && k > temp) {
                        largest = temp;
                    }
                }
            }
            System.out.println(largest);
        }

        scanner.close();
    }
}
