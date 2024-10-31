//This class contains the methods for the BinaryTree class.
//For the lab Exercise 1, you need to complete the TO-DO methods
import java.util.ArrayList;
import java.math.*;
public class BinaryTree<T> {
	private T data;
	private BinaryTree<T> parent;
	private BinaryTree<T> left;
	private BinaryTree<T> right;

	public BinaryTree() {
		parent = left = right = null;
		data = null;
	}

	public void makeRoot(T data) {
		if (!isEmpty()) {
			System.out.println("Can't make root. Already exists");
		} else
			this.data = data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setLeft(BinaryTree<T> tree) {
		left = tree;
	}

	public void setRight(BinaryTree<T> tree) {
		right = tree;
	}

	public void setParent(BinaryTree<T> tree) {
		parent = tree;
	}

	public T getData() {
		return data;
	}

	public BinaryTree<T> getParent() {
		return parent;
	}

	public BinaryTree<T> getLeft() {
		return left;
	}

	public BinaryTree<T> getRight() {
		return right;
	}

	public void attachLeft(BinaryTree<T> tree) {
		if (tree == null)
			return;
		else if (left != null || tree.getParent() != null) {
			System.out.println("Can't attach");
			return;
		} else {
			tree.setParent(this);
			this.setLeft(tree);
		}
	}

	public void attachRight(BinaryTree<T> tree) {
		if (tree == null)
			return;
		else if (right != null || tree.getParent() != null) {
			System.out.println("Can't attach");
			return;
		} else {
			tree.setParent(this);
			this.setRight(tree);
		}
	}

	public BinaryTree<T> detachLeft() {
		if (this.isEmpty())
			return null;
		BinaryTree<T> retLeft = left;
		left = null;
		if (retLeft != null)
			retLeft.setParent(null);
		return retLeft;
	}

	public BinaryTree<T> detachRight() {
		if (this.isEmpty())
			return null;
		BinaryTree<T> retRight = right;
		right = null;
		if (retRight != null)
			retRight.setParent(null);
		return retRight;
	}

	public boolean isEmpty() {
		if (data == null)
			return true;
		else
			return false;
	}

	public void clear() {
		left = right = parent = null;
		data = null;
	}

	public BinaryTree<T> root() {
		if (parent == null)
			return this;
		else {
			BinaryTree<T> next = parent;
			while (next.getParent() != null)
				next = next.getParent();
			return next;
		}
	}

	//this method counts the number of nodes in a BinaryTree recursively
	public static <T> int countNodes(BinaryTree<T> t){
		if(t==null){
			return 0;
		}
		return countNodes(t.getLeft())+countNodes(t.getRight())+1;
	}


	// this method returns the height of a BinaryTree
	public static <T> int findHeight(BinaryTree<T> t) {
		if(t==null) {
			return -1;
		}
		return Math.max(findHeight(t.left),findHeight(t.right))+1;
	}


	// this method tests whether a tree is height balanced
	public static <T> boolean heightBalanced(BinaryTree<T> t) {
		if(t==null){
			return true;
		}
		else if(findHeight(t.getLeft())-findHeight(t.getRight())>1 ||
				findHeight(t.getRight())-findHeight(t.getLeft())>1){//this makes sure they're either the same or within 1 of each other
			return false;
		}
		return heightBalanced(t);
	}

	public static <T> void preorder(BinaryTree<T> t) {
		if (t != null) {
			System.out.print(t.getData() + "\t");
			preorder(t.getLeft());
			preorder(t.getRight());
		}
	}

	public static <T> void inorder(BinaryTree<T> t) {
		if (t != null) {
			inorder(t.getLeft());
			System.out.print(t.getData() + "\t");
			inorder(t.getRight());
		}
	}

	public static <T> void postorder(BinaryTree<T> t) {
		if (t != null) {
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() + "\t");
		}
	}

	// this method uses an ArrayList to print the data associated with all
	// nodes/trees in level order
	public static <T> void levelOrder(BinaryTree<T> t) {
		ArrayList<BinaryTree<T>> nodeList = new ArrayList<BinaryTree<T>>();
		nodeList.add(t);
		//add the item to arraylist, print it, find the left/right children nodes & delete it, repeat for each node while arraylist!=empty
		while(!nodeList.isEmpty()){
			BinaryTree<T> temp=nodeList.get(0);//we will always look at the first node first
			System.out.print(nodeList.get(0).getData()+" ");
			nodeList.remove(0);
			if(temp.getLeft()!=null){
				nodeList.add(temp.getLeft());
			}
			if(temp.getRight()!=null){
				nodeList.add(temp.getRight());
			}
		}


	}
}
