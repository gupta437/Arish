package project;

public class circularLinkedList {
	Node first; 
	Node last;
	
	public circularLinkedList() {
		first = null;
		last = null;
	}
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		}
		last.next = newNode;
		last = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		
		if(first.next == null) {
			last = null;
		}
		first = first.next;
		temp.next = null;
		return temp;
	}
}
