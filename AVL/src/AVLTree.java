

/**
 This class implements AVLTrees.
 */
public class AVLTree extends BinaryTree
{

    // Convenience method casts the inherited root
    // from Node to AVLNode.
    private AVLNode getRoot()
    {
        return (AVLNode) root;
    }

    /**
     The getHeight method computes the height of an AVL tree.
     @param tree An AVL tree.
     @return The height of the AVL tree.
     */
    static int getHeight(AVLNode tree)
    {
        if (tree == null)
            return -1;
        else
            return tree.height;
    }

    /**
     The add method adds a value to this AVL tree.
     @param x The value to add.
     @return true.
     */
    public boolean add(int x)
    {
        root = add((AVLNode) root, x);
        return true;
    }

    /**
     The add method adds a value to an AVL tree.
     @return The root of the augmented AVL tree.
     */
    private AVLNode add(AVLNode bTree, int x)
    {
        if (bTree == null)
        {
            return new AVLNode(x);
        }
        if (x < bTree.value)
        {
            bTree.left = add(bTree.getLeft(), x);
        } else
        {
            bTree.right = add(bTree.getRight(), x);
        }

        // Compute heights of the left and right subtrees
        // and rebalance the tree if needed.
        int leftHeight = getHeight(bTree.getLeft());
        int rightHeight = getHeight(bTree.getRight());
        if (Math.abs(leftHeight - rightHeight) == 2)
        {
            return balance(bTree);
        } else
        {
            bTree.resetHeight();
            return bTree;
        }
    }

    /**
     The balance method rebalances an AVL tree.
     @param bTree The AVL tree needing to be balanced.
     @return The balanced AVL tree.
     */
    private AVLNode balance(AVLNode bTree)
    {
        int rHeight = getHeight(bTree.getRight());
        int lHeight = getHeight(bTree.getLeft());

        if (rHeight > lHeight)
        {
            AVLNode rightChild = bTree.getRight();
            int rrHeight = getHeight(rightChild.getRight());
            int rlHeight = getHeight(rightChild.getLeft());
            if (rrHeight > rlHeight)
            {
                return rrBalance(bTree);
            } else
            {
                return rlBalance(bTree);
            }
        } else
        {
            AVLNode leftChild = bTree.getLeft();
            int llHeight = getHeight(leftChild.getLeft());
            int lrHeight = getHeight(leftChild.getRight());
            if (llHeight > lrHeight)
            {
                return llBalance(bTree);
            } else
            {
                return lrBalance(bTree);
            }
        }
    }

    /**
     The rrBlance method corrects an RR imbalance.
     @param bTree The AVL tree wih an RR imbalance.
     @return The balanced AVL tree.
     */
    private AVLNode rrBalance(AVLNode bTree)
    {
        AVLNode rightChild = bTree.getRight();
        AVLNode rightLeftChild = rightChild.getLeft();
        rightChild.left = bTree;
        bTree.right = rightLeftChild;
        bTree.resetHeight();
        rightChild.resetHeight();
        return rightChild;
    }

    /**
     The rlBalance method corrects an RL imbalance.
     @parame bTree The AVL tree with an RL imbalance.
     @return The balanced AVL tree.
     */
    private static AVLNode rlBalance(AVLNode bTree)
    {
        AVLNode root = bTree;
        AVLNode rNode = root.getRight();
        AVLNode rlNode = rNode.getLeft();
        AVLNode rlrTree = rlNode.getRight();
        AVLNode rllTree = rlNode.getLeft();

        // Build the restructured tree.
        rNode.left = rlrTree;
        root.right = rllTree;
        rlNode.left = root;
        rlNode.right = rNode;

        // Adjust heights.
        rNode.resetHeight();
        root.resetHeight();
        rlNode.resetHeight();

        return rlNode;
    }

    /**
     The llBalance method corrects an LL imbalance.
     @param bTree The AVL tree with an LL imbalance.
     @return The balanced AVL tree.
     */
    private AVLNode llBalance(AVLNode bTree)
    {
        AVLNode leftChild = bTree.getLeft();
        AVLNode lrTree = leftChild.getRight();
        leftChild.right = bTree;
        bTree.left = lrTree;
        bTree.resetHeight();
        leftChild.resetHeight();
        return leftChild;
    }

    /**
     The lrBalance method corrects an LR imbalance.
     @param bTree The AVL tree with an LR imbalance.
     @return The balanced AVL tree.
     */
    private AVLNode lrBalance(AVLNode bTree)
    {
        AVLNode root = bTree;
        AVLNode lNode = root.getLeft();
        AVLNode lrNode = lNode.getRight();
        AVLNode lrlTree = lrNode.getLeft();
        AVLNode lrrTree = lrNode.getRight();

        // Build the restructured tree.
        lNode.right = lrlTree;
        root.left = lrrTree;
        lrNode.left = lNode;
        lrNode.right = root;

        // Adjust heights.
        lNode.resetHeight();
        root.resetHeight();
        lrNode.resetHeight();

        return lrNode;
    }


    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

    //QUESTION 1: DISPLAY AND COUNT
    public int displayAndCount(int requestedHeight) {
        //Call the private recursive method
       return displayAndCount(requestedHeight, root, 0);
    }

    private int displayAndCount(int requestedHeight, Node root, int height) {
        if(root != null){
            if (height == requestedHeight) {
                System.out.println("Node values/elements within the specified height: "
                        +root.value);
                return 1;
            }

            height++;

            int leftCount = displayAndCount(requestedHeight, root.left, height);
            int rightCount = displayAndCount(requestedHeight, root.right, height);
            return leftCount + rightCount;
        }

        return 0;
    }

    //-------------------------------------------------------------------------------------------
    /*
    QUESTION 2:
        FIND LEVEL.
     */

    public int findLevelOfValue(int requestedValue) {
        int height = -1;
        Node node = root;

        while (node != null) {
            ++height;

            if (requestedValue < node.value) {
                node = node.left;
            } else if (requestedValue > node.value) {
                node = node.right;
            } else {
                return height;
            }

        }

        return -1;
    }

    //---------------------------------------------------------------------------------
    /*
    Question 3: PATH
     */
    public void displayNodesWithinPath(int val){
        //Call the private method recursively
        displayNodesWithinPath(val, root);

    }

    private void displayNodesWithinPath(int val, Node root){

        Node node=root;
        System.out.println("PATH:" +
                "\nValue Root: "
                +node.value);

        while(node != null){


            if (val < node.value) {
                node= node.left;
                System.out.println("Value Left: "
                        +node.value);
            }

            else if(val > node.value){
                node=node.right;
                System.out.println("Value Right:"
                        +node.value);

            }

            else if(val == node.value){

                break;
            }

        }

    }

}

