
/**
Alisson Leiva Salazar
 */

public class AVLTreeDemo
{
    public static void main(String [] args){
        AVLTree tree = new AVLTree();
        //Lvl 0
        tree.add(10);
        //Lvl 1
        tree.add(60);
        tree.add(-20);
        //Lvl 2
        tree.add(90);
        tree.add(-8);
        tree.add(17);

        //Ques 1
        int count = tree.displayAndCount(0);
        System.out.println("Count of Nodes at the specified level: "+ count);

        int heightValFound=tree.findLevelOfValue(-8);
        //Ques 2
        System.out.println("Height of Requested Value: "
            +heightValFound);

        //Ques 3
        tree.displayNodesWithinPath(-8);


    }

}