package project;
import 	java.util.Hashtable;
import  java.util.Set;
import  java.io.InputStreamReader;
import  java.io.BufferedReader;
import  java.io.IOException;
import  java.nio.charset.*;

public class ransom {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		String S = "yourprincessisinanothercastle";
//		String S1 = "yourprinceisinanotherverylargecastleandisscared";
		
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    String line;
	    int n= 1;
	    String Line1 = "your princess is in another castle";
	    int k = 0;
	    String Line2 = "your prince is in another very large castle and is scared";
//	    while ((line = in.readLine()) != null) {
//	      if(n==1){
//	        Line1 = line;
//	        n++;
//	      }else if(n==2){
//	        k = Integer.parseInt(line);
//	        n++;
//	      }else{
//	        Line2 = Line2 + line;
//	      }
//	    }
		if(getRansom(Line1,Line2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	public static boolean getRansom(String S, String S1 ) {
		Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
		for(int i=0;i<S.length();i++) {
			if(ht.containsKey(S.charAt(i))){
				ht.put(S.charAt(i), ht.get(S.charAt(i))+1);
			}else {
				ht.put(S.charAt(i),1);
			}
		}
		Hashtable<Character,Integer> ht1 = new Hashtable<Character,Integer>();
			for(int i=0;i<S1.length();i++) {
				if(ht1.containsKey(S1.charAt(i))) {
					ht1.put(S1.charAt(i), ht1.get(S1.charAt(i))+1);
				}else {
					ht1.put(S1.charAt(i), 1);
				}
			}
	Set<Character> keys = ht.keySet();
	Character[] array = keys.toArray(new Character[0]);
	for(Character K:array) {
		int a = ht.get(K);
		int b = ht1.get(K);
		if (!ht.containsKey(K)) {
			return false;
		}else if(b<a){
			return false;
		}
	}
	return true;
	}
}
