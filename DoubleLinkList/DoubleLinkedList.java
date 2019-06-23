package DoubleLinkList;

public class DoubleLinkedList {
    public Node head;
    public Node tail;
    
    //Constructor
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    //Methods
    public void push(Node newNode) {
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
  
    public void printValuesBackward() {
    	Node runner = this.tail;
    	while(runner != null) {
    		System.out.println(runner.value);
    		runner = runner.previous;
    	}
    }
    
    public Node pop() {
    	if(this.tail == null) {
    		System.out.println("0 nodes!");
    	}
    	Node lastNode = this.tail;
    	this.tail = lastNode.previous;
    	return lastNode;    	
    }
    
	public boolean contains(Integer value) {
    	if(this.head == null ) {
    		System.out.println("0 Nodes!");
    		return false;
    	}
    	Node runner = this.head;
    	while(runner != null) {
    		
    	
    		if(runner.value == value) {
    			System.out.println("A Value HAS been found!");
    			return true;
    		}
    		runner = runner.next;
    	}
    	
    	System.out.println("A Value has NOT been found!");
		return false;
	}
    	
    	
    	
	
	
	
		
	public int size() {
		if(this.head == null);
			System.out.println("0 Nodes!");
		Node runner = this.head;
		int count = 0;
		while(runner != null) {
			count ++;
			runner = runner.next;
		}
		System.out.println("A total of " + count + " nodes were found!");
		return count;
	}
}
    	
    	