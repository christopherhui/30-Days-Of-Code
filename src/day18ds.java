import java.util.*;

public class day18ds {
    // Write your code here.
    Stack<Character> stack1 = new Stack<>();
    Queue<Character> queue1 = new LinkedList<>();

    void pushCharacter(char c) {
        stack1.push(c);
    }

    void enqueueCharacter(char c) {
        queue1.add(c);
    }

    char popCharacter() {
        return stack1.pop();
    }

    char dequeueCharacter() {
        return queue1.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();

        day18ds p = new day18ds();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The word, " + input + ", is " + ( (!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}