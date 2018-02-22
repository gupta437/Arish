package project;

public class implementStack {

	public static void main(String[] args) {
		Stack myStack = new Stack(10);
		
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.push(6);
		myStack.push(7);
		myStack.push(8);
		myStack.push(9);
		myStack.push(10);
		myStack.push(11);
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
		System.out.println(myStack.pop());
		System.out.println();
		Queue myQueue = new Queue(3);
		myQueue.addItem(1);
		myQueue.addItem(2);
		myQueue.addItem(3);
		myQueue.view();
		
		
	}
	

}
