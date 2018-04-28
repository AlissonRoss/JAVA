/*
Alisson Leiva Salazar
 */
public class BinaryTreeMain {
    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();
        //actual root
        tree.root = new Node(1);

        //left parent, left child of root
        tree.root.leftChild= new Node(2);
        //right parent, right child of root
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);

        System.out.println("\nIn-Order Traversal: ");
        tree.inorderTraversal();

        System.out.println("\nLevel-Order Traversal: ");
        tree.levelorderTraversal();

    }
}
