package DataStructure.DFS;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private int data;
    private List<Node> neighbours;
    private boolean visited;

    Node(int data) {
        this.data = data;
        this.neighbours=new ArrayList<>();
    }

    public void addneighbours(Node neighbourNode)
    {
        this.neighbours.add(neighbourNode);
    }

    public List<Node> getNeighbours() {
        return neighbours;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNeighbours(List<Node> neighbours) {
        this.neighbours = neighbours;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
