import java.util.*;
import java.io.*;

public class day9recursion {
    // Complete the factorial function below.
    static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        else {
            return n * factorial(n - 1);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();

        int result = factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
