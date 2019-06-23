package DoubleLinkList;

public class DoubleLinkListTest {
    public static void main(String[] args) {
        DoubleLinkedList dubll = new DoubleLinkedList();
        Node n1 = new Node(18);
        Node n2 = new Node(21);
        Node n3 = new Node(81);
 
        
        dubll.push(n1);
        dubll.push(n2);
        dubll.push(n3);
        
        dubll.pop();
        
        dubll.contains(18);
        dubll.contains(11);
        
        dubll.printValuesBackward();
        
        dubll.size();
    }
}