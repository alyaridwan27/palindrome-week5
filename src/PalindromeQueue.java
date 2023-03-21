import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class PalindromeQueue {
    public static void main(String[] args) {
        System.out.print("Enter a string = ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        Queue<Character> queue = new LinkedList<Character>();

        for (int i = 0; i < text.length(); i++) {
            queue.add(text.charAt(i));
        }

        String revText = "";

        while (!queue.isEmpty()) {
            revText = revText + queue.remove();
        }

        if (text.equals(revText)) {
            System.out.println("The input String is a palindrome.");
        } else {
            System.out.println("The input String is not a palindrome.");
        }
    }
}
