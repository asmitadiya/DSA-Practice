package linkedList;

public class SinglyLL {

    // every linkedlist will have a head and a tail so
    private Node head;
    private Node tail;
    private int size;

    // a constructor is important to initialise the size
    public SinglyLL(){
        this.size = 0;
    }

    // create a node class
    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        // create a new node
        Node node = new Node(val);

        // point the head to the new node
        node.next = head ;

        // since it is first node hence the head will be the node created
        head = node;

        // if it is the one and only node in the LL then head and tail are equal
        if(tail == null){
            tail = head;
        }

        // increase the size of the LL from 0 to 1
        size+=1;

    }

    public void insertRecursion(){
        head =  insertRecursion(3,7,head);
    }

    private Node insertRecursion(int indexToInsert , int valOfNodeToInsert , Node currentNode){

        if(indexToInsert == 0){
            Node n = new Node(valOfNodeToInsert , currentNode);
            size++;
            return n ;
        }

        currentNode.next = insertRecursion(indexToInsert--, valOfNodeToInsert,currentNode.next);
        return currentNode;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val){

        //create a node
        Node node = new Node(val);

        //if there is nothing in the LL , then we can call the insertFirst method
        if(tail == null){
            insertFirst(val);
            // do not call the below code hence return
            return;
        }

        //point tail to this node
        tail.next = node;

        // update the tail with new node created
        tail = node;

        size+=1;
    }

    public void insertIndex(int index , int val){

        // if index is 0 then call the insertFirst method
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i<index ;i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
           tail = null;
        }

        size --;
        return val ;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i< index ;i++){
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size<= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.val;

        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == 1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    public Node findIndex(int val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
