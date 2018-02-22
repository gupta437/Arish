package project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Set;

public class longestWord {
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		String word = "abpcplea";
		input.add("ale");
		input.add("apple");
		input.add("monkey");
		input.add("plea");
		input.sort(Comparator.comparing(String::length).reversed());
		System.out.println("Final "+check(input,word));
	}
	public static String check(ArrayList<String> a, String word) {
		Hashtable<Character,Integer> table = new Hashtable<Character,Integer>();
		for(int i=0;i<word.length();i++) {
			if(!table.containsKey(word.charAt(i))){
				table.put(word.charAt(i), 1);
			}else {
				table.put(word.charAt(i), table.get(word.charAt(i))+1);
			}
		}
		
		
		int len = 0;
		String result = a.get(0);
		for(int i=0; i<a.size();i++) {
			if(a.get(i).length()>len && a.get(i).length()<=word.length() && table.containsKey(a.get(i).charAt(0))) {
				Hashtable<Character,Integer> table1 = new Hashtable<Character,Integer>();
				for(int j=0;j<a.get(i).length();j++) {
					if(!table1.containsKey(a.get(i).charAt(j))){
						table1.put(a.get(i).charAt(j), 1);
					}else {
						table1.put(a.get(i).charAt(j), table1.get(a.get(i).charAt(j))+1);
					}
				}
				
				Set<Character> keys = table1.keySet();
				int k=0;
				for(Character key:keys) {
					k++;
					if((!table.containsKey(key)) || table1.get(key)>table.get(key)) {
						break;
					}else if(k==(keys.size()-1)) {
						result = a.get(i);
						len = result.length();
					}
				}
			}
		}
		return result;
	}
}
