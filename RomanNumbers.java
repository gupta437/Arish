package project;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
public class RomanNumbers {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		//Input in form of ArrayList data structure
		ArrayList<ArrayList<String>> input = new ArrayList<ArrayList<String>>();
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("Ankita");
		temp.add("IV");
		input.add(temp);
		ArrayList<String> temp1 = new ArrayList<String>();
		temp1.add("Richa");
		temp1.add("IV");
		input.add(temp1);
		ArrayList<String> temp2 = new ArrayList<String>();
		temp2.add("Richa");
		temp2.add("V");
		input.add(temp2);
		ArrayList<String> temp3 = new ArrayList<String>();
		temp3.add("Ankita");
		temp3.add("I");
		input.add(temp3);
		ArrayList<String> temp4 = new ArrayList<String>();
		temp4.add("Mom");
		temp4.add("II");
		input.add(temp4);
		ArrayList<String> temp5 = new ArrayList<String>();
		temp5.add("Dad");
		temp5.add("VI");
		input.add(temp5);
		ArrayList<String> temp6 = new ArrayList<String>();
		temp6.add("Aniket");
		temp6.add("X");
		input.add(temp6);
		
		//Print input to the console
		System.out.println("Before Sorting: "+input);
		
		//Calling the sorting function and printing the sorted ArrayList
		System.out.println("After Sorting: "+sort_input(input));
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
	
	//Method to sort the input
	@SuppressWarnings("unchecked")
	public static ArrayList<ArrayList<String>> sort_input(ArrayList<ArrayList<String>> input){
		
		// Declaring output ArrayList
		ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
		
		//Hashtable for storing the key value pairs of multiple instances of same name with different positions
		Hashtable<String,ArrayList<String>> ht = new Hashtable<String,ArrayList<String>>();
		
		for(int i=0; i<input.size();i++) {
			if(!ht.containsKey(input.get(i).get(0))) {
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(input.get(i).get(1));
				ht.put(input.get(i).get(0),temp);
			}else {
				ArrayList<String> temp = ht.get(input.get(i).get(0));
				temp.add(input.get(i).get(1));
				ht.put(input.get(i).get(0),temp);
			}
		}
		
		//to fetch all the names
		Set<String> key = ht.keySet();
		List<String> key1 = new ArrayList<String>(key);
		Collections.sort(key1);// sorting the names Lexicographically
		
		//logic to build output and sorting the names by positions 
		for(String keys: key1) {
			ArrayList<String> values = ht.get(keys);
			Collections.sort(values, new MyCustomComparator()); // using customized comparator class to compare Roman numbers
			if(values.size()>1) {
				for(int i = 0;i<values.size();i++) {
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(keys);
					temp.add(values.get(i));
					output.add(temp);
				}
			}else {
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(keys);
				temp.add(values.get(0));
				output.add(temp);
			}
		}
		return output; // return sort list 
	}
}

//comparator class to compare Roman numbers
class MyCustomComparator implements Comparator
{
	@Override
	public int compare(Object s1, Object s2) {
		String one = (String)s1;
        String two = (String)s2;
        int one1 = decode(one);
        int two2 = decode(two);
        /* for ascending order */
        if(one1>two2){
            return 1;
        }else{
            return -1;
        }
	}
	
	// method  to convert Roman letter to Decimal number
	private static int decodeSingle(char letter) {
		switch(letter) {
			case 'M': return 1000;
			case 'D': return 500;
			case 'C': return 100;
			case 'L': return 50;
			case 'X': return 10;
			case 'V': return 5;
			case 'I': return 1;
			default: return 0;
		}
	}
	
	//method to decode the Roman number to Decimal number by using above method
	public static int decode(String roman) {
		int result = 0;
		String uRoman = roman.toUpperCase(); //case-insensitive
		for(int i = 0;i < uRoman.length() - 1;i++) {//loop over all but the last character
			//if this character has a lower value than the next character
			if (decodeSingle(uRoman.charAt(i)) < decodeSingle(uRoman.charAt(i+1))) {
				//subtract it
				result -= decodeSingle(uRoman.charAt(i));
			} else {
				//add it
				result += decodeSingle(uRoman.charAt(i));
			}
		}
		//decode the last character, which is always added
		result += decodeSingle(uRoman.charAt(uRoman.length()-1));
		return result;
	}
}
