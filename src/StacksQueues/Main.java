package StacksQueues;

import static java.lang.Integer.MAX_VALUE;

public class Main {

    static void main() throws StackException {
        int max = MAX_VALUE;
        CustomStack stack = new CustomStack(5);
        CustomStack ds = new DynamicStack(5);

        stack.push(3);
        stack.push(5);
        stack.push(19);
        stack.push(34);
        stack.push(1);

        ds.push(3);
        ds.push(5);
        ds.push(19);
        ds.push(34);
        ds.push(1);
        ds.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}
