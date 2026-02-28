package trees;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {
    }

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    //insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner,root);
    }

    private void populate(Scanner scanner , Node node){
        System.out.println("Do you want to enter in the left of " + node.val);
        boolean left = scanner.nextBoolean();
        if(left){
           int value = scanner.nextInt();
           node.left = new Node(value);
           populate(scanner, node.left);
        }

        System.out.println("Do you want to enter in the right of " + node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    //display the tree
    public void display(){
        display(root,"");
    }

    private void display(Node node , String indent){
        if(node == null){
            return;
        }

        System.out.println(indent + node.val);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }
}
