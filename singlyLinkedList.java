package project;

public class singlyLinkedList {
	private Node first;
	
	public singlyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = new Node();
		temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		Node current = first;
		while(current != null) {
			current.display();
			current = current.next;
		}
	}
	
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
}
