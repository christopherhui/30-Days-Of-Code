import java.util.*;
import java.util.regex.*;

public class day28regex {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> arr = new ArrayList();
        Pattern p = Pattern.compile("[a-z]+@gmail.com");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Matcher m = p.matcher(emailID);
            if (m.find()) {
                arr.add(firstName);
            }
        }
        Collections.sort(arr);
        for (String str : arr) {
            System.out.println(str);
        }
        scanner.close();
    }
}
