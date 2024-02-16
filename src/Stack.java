import java.util.Stack;

public class Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Uncharted 4");
        stack.push("GTA 5");
        stack.push("Hitman 3");
        stack.pop();
        stack.push("GTA vice city");
        System.out.println(stack.peek());
        System.out.println(stack.search("GTA 5"));
    }
}
