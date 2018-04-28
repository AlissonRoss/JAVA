
/*
Alisson Leiva Salazar
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class BinaryTree {

    Node root;

    void inorderTraversal() {
        if (root == null) {
            return;
        }

        Node currentNode = root;
        //Stack to hold nodes
        Stack<Node> s = new Stack<>();

        //LEFT
        //Pushing the currentNode into the left
        while (currentNode != null) {
            s.push(currentNode);
            currentNode = currentNode.leftChild;
        }
        while (s.size() > 0){

                currentNode = s.pop();
                //prints current element
                System.out.println("Element: "
                        + currentNode.element);
            //RIGHT
            if (currentNode.rightChild != null) {
                //currentNode is being set as the right Child
                currentNode = currentNode.rightChild;

                while (currentNode != null) {
                    s.push(currentNode);
                    currentNode = currentNode.leftChild;
                }
            }

        }
    }
    void levelorderTraversal() {

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node currentNode = q.remove();

            //prints elements
            System.out.println("Elements: "
                    +currentNode.element);

            //adding leftChild of the node to the q if it's not empty
            if (currentNode.leftChild != null) {
                q.add(currentNode.leftChild);

            }
            //adding rightChild to the q if not empty
            if (currentNode.rightChild != null) {
                q.add(currentNode.rightChild);

            }
        }
    }
}


