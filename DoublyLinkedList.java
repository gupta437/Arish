package project;

public class DoublyLinkedList {
	
	private Node2 first;
	private Node2 last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node2 newNode = new Node2();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}else {
			first.prev = newNode;
		}
		newNode.next = first;
		first = newNode;
	}
	
	public void insertLast(int data) {
		Node2 newNode = new Node2();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		}else {
			last.next = newNode;
			newNode.prev = last;
		}
		last = newNode;
	}
	
	public Node2 deleteFirst() {
		Node2 temp = first;
		if(first.next == null) {
			last = null;
		}else {
			first.next.prev = null;
		}
		first = first.next;
		temp.next = null;
		return temp;
	}
	
	public Node2 deleteLast() {
		Node2 temp  = last;
		if(first.next == null) {
			first = null;
		}else {
			last.prev.next = null;
		}
		last = last.prev;
		temp.prev = null;
		return temp;
	}
	
	public boolean insertAfter(int key, int data) {
		Node2 current = first;
		while(current.data != key) {
			current = current.next;
			if(current.next == null) return false;
		}
		Node2 newNode = new Node2();
		newNode.data = data;
		if(current == last) {
			newNode.prev = last;
			last.next = newNode;
			last = newNode;
		}else {
			newNode.next = current.next;
			current.next.prev = newNode;
		}
		newNode.prev = current;
		current.next = newNode;
		return true;
	}
	
	public Node2 deleteKey(int key) {
		if(key == first.data) {
			return deleteFirst();
		}else if(key == last.data) {
			return deleteLast();
		}else {
			Node2 current = first;
			while(current.data != key) {
				current = current.next;
				if(current.next == null) {
					return null;
				}
			}
			Node2 temp = current;
			current.prev.next = current.next;
			current.next.prev = current.prev;
			current.next = null;
			current.prev = null;
			return temp;
		}
	}
	
	public void displayForward() {
		Node2 current = first;
		while(current != null) {
			current.diaplayNode();
			current = current.next;
		}
	}
	
	public void displayBackward() {
		Node2 current = last;
		while(current != null) {
			current.diaplayNode();
			current = current.prev;
		}
	}
}
