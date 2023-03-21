import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack {
    public static void main (String[] args){
        System.out.print("Enter a string = ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        Stack stack = new Stack();

        for(int i = 0; i<text.length(); i++){
            stack.push(text.charAt(i));
        }

        String revText = "";

        while(!stack.isEmpty()){
            revText = revText+stack.pop();
        }

        if (text.equals(revText)) {
            System.out.println("The input String is a palindrome.");
        }
        else {
            System.out.println("The input String is not a palindrome.");
        }
    }

}
