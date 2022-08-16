import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;


public class palindrome {

    public static void main(String[] args) {

        boolean isPalindrome = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("======================Palindrome Checker ======================");

        // taking user input
        System.out.print("Enter word: ");
        String input = sc.nextLine();

        // instantiate a stack and queue
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<Character>();

        // putting all elements in a stack
        for (int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }

        // putting all elements in a queue
        for (int i = 0; i < input.length(); i++){
            queue.add(input.charAt(i));
        }

        while (!queue.isEmpty()){
            if (queue.remove().equals(stack.pop())){
                continue;
            } else {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }

}
