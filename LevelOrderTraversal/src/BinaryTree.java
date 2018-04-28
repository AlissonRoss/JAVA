
import javax.swing.*;
import java.util.Stack;
public class BinaryTree {

    Node root;

    void inorderTraversal(){
        if(root==null) {
            return;
        }

        Node currentNode= root;
        //Stack to hold nodes
        Stack<Node> s=new Stack<>();

        //Pushing the currentNode into the left
        while(root==null){
            s.push(currentNode);
            currentNode=currentNode.leftChild;
        }

        if(currentNode==null && !s.isEmpty()){
           Node poppedElement= s.pop();
           System.out.println("Element: "
                   +poppedElement.element);
            while(root==null){
                s.push(currentNode);
                currentNode=currentNode.leftChild;
            }

        }
    }

    //void levelorderTraversal(){
        //Queue<T> q=new Queue();
        //nq(q,root);
        //while(!q.isEmpty()){

        //}

}


