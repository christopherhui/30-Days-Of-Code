import java.util.Scanner;

public class Difference {
    private int[] elements;
    public int maximumDifference;
    // Add your code here
    int min = 100;
    int max = 1;
    Difference(int[] elements) {
        this.elements = elements;
        this.maximumDifference = maximumDifference;
    }

    void computeDifference() {
        for (int i : elements) {
            if (i < min) {min = i;}
            if (i > max) {max = i;}
        }
        maximumDifference = max - min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.println(difference.maximumDifference);
    }
}