import java.util.Stack;

public class framwork_stackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.capacity());
        stack.push("first");
        stack.push("Second");
        System.out.println(stack);
        System.out.println(stack.search("first"));
        System.out.println(stack.pop());
    }
}
