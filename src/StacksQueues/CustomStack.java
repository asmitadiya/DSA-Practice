package StacksQueues;

public class CustomStack {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){

        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return  ptr == -1;
    }

    public int pop() throws  StackException{
        if(isEmpty()){
            throw new StackException("Cannot remove from an Empty Stack");
        }

        /*int removed = data[ptr];
        ptr--;
        return removed;*/
        return data[ptr--];
    }

    // what is at the top , for that we use peek function
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peek from an Empty Stack");
        }

        return data[ptr];
    }
}
