import java.util.Scanner;

public class day112darray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int maxSum = -9 * 7;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        for (int a = 0; a < 4; a++) {

            for (int b = 0; b < 4; b++) {
                int sum = arr[a][b] + arr[a][b+1] + arr[a][b+2] + arr[a+1][b+1]
                        + arr[a+2][b] + arr[a+2][b+1] + arr[a+2][b+2];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.print(maxSum);
        scanner.close();
    }
}
