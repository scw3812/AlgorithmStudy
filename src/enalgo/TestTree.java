package enalgo;

public class TestTree {
	public static void main(String[] args) {
		Tree t = new Tree();
		Tree.Node n4 = t.makeNode(null, 4, null);
		Tree.Node n5 = t.makeNode(null, 5, null);
		Tree.Node n2 = t.makeNode(n4, 2, n5);
		Tree.Node n3 = t.makeNode(null, 3, null);
		Tree.Node n1 = t.makeNode(n2, 1, n3);
		
		t.setRoot(n1);
		t.inorder(n1);
		t.preorder(n1);
		t.postorder(n1);
	}
}

class Tree{
	class Node{
		int data;
		Node left;
		Node right;
	}
	
	public Node root;
	
	public void setRoot(Node node) {
		this.root = node;
	}
	public Node getRoot() {
		return root;
	}
	public Node makeNode(Node left, int data, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		return node;
	}
	public void inorder(Node node) {
		if(node != null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
	public void preorder(Node node) {
		if(node != null) {
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}
	public void postorder(Node node) {
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.data);
		}
	}
}
