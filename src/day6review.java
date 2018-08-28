import java.util.Scanner;

public class day6review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 0; i < num; i++) {
            char[] myCharArray = scan.next().toCharArray();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for(int j = 0; j < myCharArray.length; j++) {
                if(j % 2 == 0) {
                    even.append(myCharArray[j]);
                }
                else {
                    odd.append(myCharArray[j]);
                }
            }
            System.out.println(even + " " + odd);
        }
        scan.close();
    }
}
