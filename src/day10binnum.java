import java.util.Scanner;

public class day10binnum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        StringBuilder str = new StringBuilder();
        int biggestSF = 0;
        int biggest = 0;

        while (n > 0) {
            str.append(n % 2);
            n = n / 2;
        }

        for (char i: str.toString().toCharArray()) {
            if (i == '1') {
                biggest++;
            }
            else {
                biggest = 0;
            }
            if (biggest > biggestSF) {
                biggestSF = biggest;
            }
        }

        System.out.println(biggestSF);
        scanner.close();
    }
}
