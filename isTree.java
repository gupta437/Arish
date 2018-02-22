package project;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class isTree {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(0);
		temp.add(1);
		edges.add(temp);
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		temp1.add(1);
		temp1.add(3);
		edges.add(temp1);
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		temp2.add(0);
		temp2.add(2);
		edges.add(temp2);
		ArrayList<Integer> temp3 = new ArrayList<Integer>();
		temp3.add(2);
		temp3.add(4);
		edges.add(temp3);
		ArrayList<Integer> temp4 = new ArrayList<Integer>();
		temp4.add(2);
		temp4.add(5);
		edges.add(temp4);
		ArrayList<Integer> temp5 = new ArrayList<Integer>();
		temp5.add(4);
		temp5.add(5);
		edges.add(temp5);
		ArrayList<Integer> temp6 = new ArrayList<Integer>();
		temp6.add(4);
		temp6.add(6);
		edges.add(temp6);
		System.out.print(edges);
		System.out.println(ifTree(edges));
	}
	
	public static boolean ifTree(ArrayList<ArrayList<Integer>> input) {
		Hashtable<Integer,Integer> ht = new Hashtable<Integer, Integer>();
		for(int i=0;i<input.size();i++) {
			if(ht.containsKey(input.get(i).get(0))) {
				ht.put(input.get(i).get(0),ht.get(input.get(i).get(0))+1);
				//ht.put(input.get(i).get(1),ht.get(input.get(i).get(1))+1);
			}else{
				ht.put(input.get(i).get(0),1);
				//ht.put(input.get(i).get(1),1);
			}
			if(ht.containsKey(input.get(i).get(1))) {
				//ht.put(input.get(i).get(0),ht.get(input.get(i).get(0))+1);
				ht.put(input.get(i).get(1),ht.get(input.get(i).get(1))+1);
			}else{
				//ht.put(input.get(i).get(0),1);
				ht.put(input.get(i).get(1),1);
			}
		}
		
		Set<Integer> keys = ht.keySet();
		int sum=0;
		for(Integer key: keys) {
			sum+=ht.get(key);
		}
		if(sum == 2*(ht.size()-1)){
			return true;
		}else
			return false;
	}
}
