package DataStructure.ReverseLinkedList;

public class Node {

    private Object obj;
    private Node next;

    public Node(Object obj, Node next) {
        this.obj = obj;
        this.next = next;
    }

    public Object getObj() {
        return obj;
    }

    public Node getNext() {
        return next;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
