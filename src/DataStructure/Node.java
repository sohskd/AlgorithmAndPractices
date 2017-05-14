package DataStructure;

public class Node {
	
	public static void main(String[] args) {
		
		head theNodeedList = new head();
		System.out.println(theNodeedList.isEmpty());
		
		// Insert Node and add a reference to the book Node added just prior
		// to the field next
		
		theNodeedList.insertFirstNode("Don Quixote", 500);
		theNodeedList.insertFirstNode("A Tale of Two Cities", 200);
		
		theNodeedList.display();
		
		System.out.println(theNodeedList.isEmpty());
//		theNodeedList.insertFirstNode("A Tale of Two Cities", 200);
//		theNodeedList.insertFirstNode("The Lord of the Rings", 150);
//		theNodeedList.insertFirstNode("Harry Potter and the Sorcerer's Stone", 107);
//		
//		theNodeedList.display();
//		
//		System.out.println("Value of first in NodeedList " + theNodeedList.firstNode + "\n");
//		
//		// Removes the last Node entered
//		
//		theNodeedList.removeFirst();
//		
//		theNodeedList.display();
//		
//		System.out.println(theNodeedList.find("The Lord of the Rings").bookName + " Was Found");
//		
//		theNodeedList.removeNode("A Tale of Two Cities");
//		
//		System.out.println("\nA Tale of Two Cities Removed\n");
//		
//		theNodeedList.display();
		
	}
	
	// Set to public so getters & setters aren't needed
	
		public String bookName;
		public int millionsSold;
		
		// Reference to next Node made in the NodeList
		// Holds the reference to the Node that was created before it
		// Set to null until it is connected to other Nodes
		
		public Node next; 
		
		public Node(String bookName, int millionsSold){
			
			this.bookName = bookName;
			this.millionsSold = millionsSold;
			
		}
		
		public void display(){
			
			System.out.println(bookName + ": " + millionsSold + ",000,000 Sold");
			
		}
		
		public String toString(){
			
			return bookName;
			
		}
	
}
