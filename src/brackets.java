package project;
import 	java.util.Hashtable;
import java.util.Stack;
public class brackets {
	public static void main(String[] args) {
		//String S = "{()}";
//		Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
//		for(int i=0;i<S.length();i++) {
//			if(ht.containsKey(S.charAt(i))){
//				ht.put(S.charAt(i), ht.get(S.charAt(i))+1);
//			}else {
//				ht.put(S.charAt(i),1);
//			}
//		}
//		if((ht.get('(') == ht.get(')')) && (ht.get('{') == ht.get('}'))) {
//			System.out.println("True");
//		}else
//			System.out.println("False");
		String a = "{{{[]()}}}";
		Stack <Character> b = new Stack <Character>();
		for (int i = 0;i<a.length();i++) {
			if(a.charAt(i)=='{' || a.charAt(i)=='(' || a.charAt(i)=='[') {
				b.push(a.charAt(i));
			}
			else {
				if((a.charAt(i) == '}' && b.peek() == '{') ||(a.charAt(i) == ')' && b.peek() == '(') || (a.charAt(i) == ']' && b.peek() == '[')) {
					b.pop();
				}
				else {
					System.out.println("No");
					break;
				}
			}
		}
		if(b.isEmpty()) {
		System.out.println("yes");
		}	
	}
}
