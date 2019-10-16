package DataStructure.TreeTraversal;

public class BinaryTree {

    private Node root;

    public BinaryTree() {}

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);

        binaryTree.printInOrder(binaryTree.root);

        binaryTree.printPreOrder(binaryTree.root);
    }

    private void printInOrder(Node node) {

        if (node == null) {
            return;
        }

        printInOrder(node.left);

        System.out.println(node.obj);

        printInOrder(node.right);
    }

    private void printPreOrder(Node node) {

        if (node == null) {
            return;
        }

        System.out.println(node.obj);
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
}
