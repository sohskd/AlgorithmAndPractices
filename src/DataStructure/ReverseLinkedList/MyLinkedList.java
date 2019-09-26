package DataStructure.ReverseLinkedList;

public class MyLinkedList {

    private Node head;

    public MyLinkedList(Node node) {
        this.head = node;
    }

    public static void main(String[] args) {

        Node nodeThree = new Node(3, null);
        Node nodeTwo = new Node(2, nodeThree);
        Node nodeOne = new Node(1, nodeTwo);

        MyLinkedList myLinkedList = new MyLinkedList(nodeOne);

        myLinkedList.printLinkedList(myLinkedList.head);

        System.out.println();
        System.out.println("After reverse");
        Node head = myLinkedList.reverseLinkedList(myLinkedList.head);
        myLinkedList.printLinkedList(head);
    }

    public Node reverseLinkedList(Node head) {

        Node current = this.head;
        Node prev = null;

        while(current != null) {

            Node temp = current.getNext();
            current.setNext(prev);
            prev = current;
            current = temp;
        }

        head = prev;
        return head;
    }

    public void printLinkedList(Node head) {

        Node current = head;

        while(current != null) {
            System.out.print(current.getObj());
            current = current.getNext();
        }
    }
}
