package project;

public class polymorphism {
	public class Base{
		Base(){
			System.out.println("Base class contructor calles");
			show();
		}
		public static void show() {
			System.out.println("Base class show method called");
		}
		public static void Display() {
			System.out.println("Base class Display method called");
		}
	}
	public class Derived extends Base {
		Derived(){
				
		}
		@Override
		public static void show() {
			System.out.println("Derived class show method called");
		}
		public static void Display() {
			System.out.println("Derived class Display method called");
		}
	}
	//public class test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Base();
		Base.show();
		Base.Display();
		
	}
	//}
}
