package project;

public class Queue {
	long[] queueArray;
	int maxSize;
	int rear;
	int front;

public Queue(int maxSize) {
	this.maxSize= maxSize;
	this.queueArray = new long[maxSize];
	rear = -1;
	front = 0;
}

public void addItem(long item) {
	if(rear == maxSize-1) {
		rear = -1;
	}
	rear++;
	queueArray[rear] = item;
}

public void view() {
	for(int i=0; i<=rear;i++) {
		System.out.println(queueArray[i]);
	}
	
}

public long remove() {
	int removeLast= front;
	front++;
	if(front == maxSize-1) {
		front = 0;
	}
	return queueArray[removeLast];
}

public boolean isEmpty() {
	return (front == 0);
}

public boolean isFull() {
	return (rear == maxSize-1);
}

}
