public class BinaryTreeMain {
    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.root.leftChild= new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);

        tree.inorderTraversal();

    }
}
