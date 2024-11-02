import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<BinaryTree<String>> nodeNames = new ArrayList<>();
        System.out.println("Enter name or done: ");
        String input = keyboard.next();
        while(!input.equals("done")) {
            BinaryTree<String> newNode = new BinaryTree<>();//each node is a "new tree"
            newNode.makeRoot(input);//make it a node
            nodeNames.add(newNode);//add it to the list (so we can access it later)
            input = keyboard.next();
        }//takes inputs and makes them nodes for later
        for (int i = 0; i < nodeNames.size() / 2; i++){//only run until nodeNames.size()/2 because the second half of the nodes attach to the first half of the list
            BinaryTree<String> parent = nodeNames.get(i);
            int leftIndex=2*i+1;
            int rightIndex=2*i+2;
            if (leftIndex < nodeNames.size()){//this if statement will catch if the node doesn't exit (it'll be out of bounds)
                parent.attachLeft(nodeNames.get(leftIndex));
            }
            if (rightIndex < nodeNames.size()){//this if statement will catch if the node doesn't exit (it'll be out of bounds)
                parent.attachRight(nodeNames.get(rightIndex));
            }
        }//attaches everything together

        BinaryTree<String> treeHead = nodeNames.get(0);//this is the top of the tree (so we can call it later, aka 2 lines later)

        //print lines do not touch

        System.out.print("Inorder:\t");
        BinaryTree.inorder(treeHead);
        System.out.println();

        System.out.print("Preorder:\t");
        BinaryTree.preorder(treeHead);
        System.out.println();

        System.out.print("Postorder:\t");
        BinaryTree.postorder(treeHead);
        System.out.println();

        System.out.print("Levelorder:\t");
        BinaryTree.levelOrder(treeHead);
        System.out.println();

        System.out.printf("Height of the tree is: %d\n", BinaryTree.findHeight(treeHead));
        System.out.printf("Number of nodes in the tree is: %d\n", BinaryTree.countNodes(treeHead));
    }
}
