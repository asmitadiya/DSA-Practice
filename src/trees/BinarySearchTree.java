package trees;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(){

    }

    public class Node{
        private int value;
        private int height;
        private Node left ;
        private Node right ;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }


    public void insert(int val){
        root = insert(root, val);
    }

    private Node insert(Node node ,int val){
        if(node == null){
            Node n = new Node(val);
            return n;
        }

        if(val<node.getValue()){
            node.left = insert(node.left, val);
        }

        if(val<node.getValue()){
            node.right = insert(node.right, val);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;

        return node;
    }

    public void insertMany(int[] nums){
        for(int i = 0 ; i<nums.length ; i++){
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums , 0 , nums.length);
    }

    private void populateSorted(int[] nums, int start , int end){

        if(start>=end){
            return ;
        }

        int mid = (start+end)/2;

        populateSorted(nums, start , mid);
        populateSorted(nums, mid+ 1, end);

    }

    public boolean getBalanced(){
        return getBalanced(root);
    }

    private boolean getBalanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right))<=1 && getBalanced(node.left) && getBalanced(node.right);
    }

    public void display(){
        display(root , "Root is: ");
    }

    public void display(Node node , String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.getValue());

        display(node.left , "The left value of "+node.getValue()+"is: ");
        display(node.right , "The right value of "+node.getValue()+"is: ");
    }

    public void preOrder(){
        preOrder(root);
    }

    public void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.getValue() + " " );
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.getValue() + " " );
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    public void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.getValue() + " " );
    }

}
