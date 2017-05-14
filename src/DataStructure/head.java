package DataStructure;

class head{
	
	// Reference to first Node in list
	// The last Node added to the NodeedList
	
	public Node firstNode; 
	
	head(){
		
		// Here to show the first Node always starts as null
		
		firstNode = null;
		
	}
	
	// Returns true if head is empty
	
	public boolean isEmpty(){
		
		return(firstNode == null);
		
	}
	
	public void insertFirstNode(String bookName, int millionsSold){
		
		Node newNode = new Node(bookName, millionsSold);
		
		// Connects the firstNode field to the new Node 
		
		newNode.next = firstNode;
		
		firstNode = newNode;
		
	}
	
	public Node removeFirst(){
		
		Node NodeReference = firstNode;
		
		if(!isEmpty()){
		
			// Removes the Node from the List
		
			firstNode = firstNode.next;
		
		} else {
			
			System.out.println("Empty LinkedList");
			
		}
		
		return NodeReference;
		
	}
	
	public void display(){
		
		Node theNode = firstNode;
		
		// Start at the reference stored in firstNode and
		// keep getting the references stored in next for
		// every Node until next returns null
		
		while(theNode != null){
			
			theNode.display();
			
			System.out.println("Next Node: " + theNode.next);
			
			theNode = theNode.next;
			
			System.out.println();
			
		}
		
	}
	
	public Node find(String bookName){
		
		Node theNode = firstNode;
		
		if(!isEmpty()){
		
			while(theNode.bookName != bookName){
			
				// Checks if at the end of the NodeedList
			
				if(theNode.next == null){
				
					// Got to the end of the Nodes in NodeedList
					// without finding a match
				
					return null;
				
				} else {
				
					// Found a matching Node in the NodeedList
				
					theNode = theNode.next;
				
				}
			
			}
			
		} else {
			
			System.out.println("Empty NodeedList");
			
		}
		
		return theNode;
		
	}
	
	public Node removeNode(String bookName){
		
		Node currentNode = firstNode;
		Node previousNode = firstNode;
		
		// Keep searching as long as a match isn't made
		
		while(currentNode.bookName != bookName){
			
			// Check if at the last Node in the NodeedList
			
			if(currentNode.next == null){
				
				// bookName not found so leave the method
				
				return null; 
				
			} else {
				
				// We checked here so let's look in the
				// next Node on the list
				
				previousNode = currentNode; 
				
				currentNode = currentNode.next;
				
			}
			
		}
		
		if(currentNode == firstNode){
			
			// If you are here that means there was a match
			// in the reference stored in firstNode in the
			// NodeedList so just assign next to firstNode
			
			firstNode = firstNode.next;
			
		} else {
			
			// If you are here there was a match in a Node other 
			// than the firstNode. Assign the value of next for
			// the Node you want to delete to the Node that's 
			// next previously pointed to the reference to remove
			
			System.out.println("FOUND A MATCH");
			System.out.println("currentNode: " + currentNode);
			System.out.println("firstNode: " + firstNode);
			
			previousNode.next = currentNode.next;
			
		}
		
		return currentNode;
		
	}
	
}
