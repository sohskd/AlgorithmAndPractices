package GeeksForGeeks;

public class isBSTOrNot {

    public static void main(String[] args) {

        Node root = new Node(4);

//        root.left = new Node(2);
//        root.right = new Node(5);
//        root.left.left = new Node(1);
//        root.left.right = new Node(3);

        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.right.left = new Node(3);
        root.right.right = new Node(8);

        isBSTOrNot isBSTOrNot = new isBSTOrNot();
        boolean ans = isBSTOrNot.isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(ans);
    }

    boolean isBSTUtil(Node node, int min, int max) {

        // If node is null, it is bst
        if (node == null)
            return true;

        // check constraints
        if (node.data < min || node.data > max)
            return false;

        return isBSTUtil(node.left, min, node.data - 1)
                && isBSTUtil(node.right,node.data + 1, max);

    }

    static class Node {

        int data;
        Node left, right;

        public Node(int val) {
            this.data = val;
        }
    }
}
