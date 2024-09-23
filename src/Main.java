import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String s = "(){}[]";
        boolean valid = bracketsValidation(s);
        System.out.println(valid);

        String s2 = "(){}[[]{]";
        boolean valid2 = bracketsValidation(s2);
        System.out.println(valid2);
    }

    private static boolean bracketsValidation(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}