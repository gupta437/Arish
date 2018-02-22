package project;

import java.util.Arrays;

/**
 * Program to sort a List of list
 * Problem statement - Given a list of list, sort the input composed of string and Roman numerals in lexicographical order.
 * 
 * @author Ankita Gupta
 *
 */

/*
Example
input=[[Ankita, IV], [Richa, IV], [Richa, V], [Ankita, I], [Mom, II], [Dad, VI], [Aniket, X]]
output= [[Aniket, X], [Ankita, I], [Ankita, IV], [Dad, VI], [Mom, II], [Richa, IV], [Richa, V]]
Either of the following solutions are acceptable:
Complexities: O(nlog(n))
*/

/*
Thoughts:
	Data Structure : ArrayList, Hashtable, Set
    Thinking process:
    Push everything into a Hashtable with names as key and Roman Numbers as Values.
    Fetch all the keys and store it into Set.
    Sort the keys using sort method of collections.
    Push the names in the sorted way into the output ArrayList data structure
    While pushing the names check it has multiple values in the value component of Hashtable.
    Then get Sort them by using MycustomComparator class and Decode functions.
*/
public class ResverseSentence {
	public static void main(String[] args) {
		
		String input = " MY";
		
		System.out.println(reverse(input));
	}
	
	public static String reverse(String s) {
		
		
//		String Output = "";
//		
//		String[] words = input.trim().split("\\s+");
//		//String temp = input.replaceAll(" ", "/");
//		//String[] words = temp.split("/");
//		
//		for(int i=words.length-1; i>0
//				;i--) {
//			System.out.println(words[i]);
//			Output+=words[i]+" ";
//			//Output+=" ";
//		}
//		return Output+words[0];
		
		String[] parts = s.trim().split("\\s+");
		String[] words = s.split("\\s+");
		System.out.println(Arrays.asList(parts));
		System.out.println(Arrays.asList(words));
        String out = "";
        String out1 = "";
        for (int i = parts.length - 1; i > 0; i--) {
            out += parts[i] + " ";
            out1 += words[i] + " ";
        }
        //System.out.println(words[0]);
        System.out.println("Yes"+parts.length);
        System.out.println("Yes"+words.length);
        return out + words[0];
	}
}
