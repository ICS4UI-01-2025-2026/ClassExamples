public class StackTest {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(-3);
        s.push(10);
        s.push(-6);
        s.push(5);
        s.push(8);
        s.push(1);
        System.out.println(s.peek());
        int top = s.pop();
        System.out.println(s.peek());
    }
}
