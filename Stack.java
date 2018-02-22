package project;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;


public Stack(int maxSize) {
	this.maxSize= maxSize;
	this.stackArray = new long[maxSize];
	this.top = -1;
} 

public void push(long item) {
	if(top == maxSize-1) {
		System.out.println("Maximum size of stack reached");
		//return 0;
	}else {
		top++;
		stackArray[top] = item;
	}
}

public long pop(){
	if(isEmpty()) {
		System.out.println("Stack is already empty");
		return -1;
	}
	int last = top;
	top--;
	return stackArray[last];
}

public boolean isEmpty() {
	return (top==-1);
}

public boolean isFull() {
	return (maxSize-1 == top);
}

public long peak() {
	return stackArray[top];
}
}