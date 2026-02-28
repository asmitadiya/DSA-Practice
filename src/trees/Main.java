package trees;

import java.util.Scanner;

public class Main {

    static void main() {
        Scanner s = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(s);
        tree.display();
    }
}
