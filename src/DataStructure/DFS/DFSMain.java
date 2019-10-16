package DataStructure.DFS;

import java.util.List;

public class DFSMain {

    public static void main(String[] args) {

        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);

        dfs(node40);
    }


    // Recursive DFS
    public static void dfs(Node node)
    {
        System.out.print(node.getData() + " ");
        List<Node> neighbours=node.getNeighbours();
        node.setVisited(true);
        for (int i = 0; i < neighbours.size(); i++) {
            Node n=neighbours.get(i);
            if(n!=null && !n.isVisited())
            {
                dfs(n);
            }
        }
    }
}
