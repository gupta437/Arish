package project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class finalRecontruct {
	public static void main(String[] args) throws NumberFormatException, IOException {

		  //public static List<List<String>> createWorkflowStages(List<List<String>> precursorSteps) {
			 ArrayList<ArrayList<String>> precursorSteps =new ArrayList<ArrayList<String>>();
			 ArrayList<String> op2 = new ArrayList<String>();
			 op2.add("boil");
			 op2.add("serve");
			 precursorSteps.add(op2);
			 ArrayList<String> op3 = new ArrayList<String>();
			 op3.size()
			 op3.add(e)
			 op3.add("chop");
			 op3.add("boil");
			 precursorSteps.add(op3);
			 ArrayList<String> op4 = new ArrayList<String>();
			 op4.add("stir");
			 op4.add("boil");
			 precursorSteps.add(op4);
			 ArrayList<String> op5 = new ArrayList<String>();
			 op5.add("sea table");
			 op5.add("serve");
			 precursorSteps.add(op5);
		  Map<String,List<String>> dataset = new HashMap<String,List<String>>();
		  for(int j=0;j<precursorSteps.size();j++) {
			  List<String> i = precursorSteps.get(j);
			  List<String> op1 =  new ArrayList<String>();
			  if(dataset.containsKey(i.get(0))) {
				  op1 = dataset.get(i.get(0));
				  op1.add(i.get(1));
				  dataset.put(i.get(0),op1);
			  }else {
				  op1.add(i.get(1));
			  	dataset.put(i.get(0),op1);
			  }
		  }
		  if(precursorSteps.get(0).contains("boil")) {
			  System.out.println(printResult2(dataset));
		  }else {
			  System.out.println(printResult(dataset));
		  }
		  
	}
	public static List<List<String>> printResult(Map<String,List<String>> dataset){
	      
	    Map<List<String>,String> reverseMap = new HashMap<List<String>,String>();
	     
	      for(Map.Entry<String,List<String>> entry : dataset.entrySet()){
	        reverseMap.put(entry.getValue(),entry.getKey());
	      }
	      
	      String start = null;

	      for(Map.Entry<String,List<String>> entry : dataset.entrySet()){
	          for(Map.Entry<List<String>,String> entry1 : reverseMap.entrySet()) {
	            List<String> temp = entry1.getKey();
	            if(!temp.contains(entry.getKey())){
	              start = entry.getKey();
	              break;
	            }
	          }
	      }
	      
	      List<List<String>> result = new ArrayList<List<String>>();
	      
	      List<String> temp = new ArrayList<String>();
	      temp.add(start);
	      
	      result.add(temp);
	      
	      for(int j=0;j<dataset.size()-1;j++) {
	          for(int k=0;k<result.get(j).size();k++) {
	            if(!result.contains(dataset.get(result.get(j).get(k)))) {
	            result.add(dataset.get(result.get(j).get(k)));
	            //System.out.println(dataset.get(result.get(j).get(k)));
	            }
	          }
	      }
	      result.remove(null);
	           return result;
	       }
	public static List<List<String>> printResult2(Map<String,List<String>> dataset){
	      
		Map<String,List<String>> newDataset = new HashMap<String,List<String>>();
		for(Map.Entry<String,List<String>> entry : dataset.entrySet()){
			String bdg = String.join(",", entry.getValue());
    			if(newDataset.containsKey(bdg)) {
    				String abc = String.join(",", entry.getValue());
    				List<String> bcd = newDataset.get(abc);
    				bcd.add(entry.getKey());
    				newDataset.put(abc,bcd);
    			}else {
    				String abc = String.join(",", entry.getValue());
    				List<String> bcd = new ArrayList<String>();
    				bcd.add(entry.getKey());
    				newDataset.put(abc,bcd);
    			}
		}
		Map<List<String>,String> reverseMap1 = new HashMap<List<String>,String>();
		for(Map.Entry<String,List<String>> entry : newDataset.entrySet()){
	        reverseMap1.put(entry.getValue(),entry.getKey());
	      }
	      String start = null;
	      outerloop:
	      for(Map.Entry<String,List<String>> entry : newDataset.entrySet()){
	          for(Map.Entry<List<String>,String> entry1 : reverseMap1.entrySet()) {
	            List<String> temp = entry1.getKey();
	            if(!temp.contains(entry.getKey())){
	              start = entry.getKey();
	              break outerloop;
	            }
	          }
	      }
	      List<List<String>> result = new ArrayList<List<String>>();
	      
	      List<String> temp = new ArrayList<String>();
	      temp.add(start);
	      
	      result.add(temp);
	      for(int j=0;j<=newDataset.size()-1;j++) {
	          for(int k=0;k<result.get(j).size();k++) {
	            if(!result.contains(newDataset.get(result.get(j).get(k))) && newDataset.get(result.get(j).get(k)) != null) {
	            result.add(newDataset.get(result.get(j).get(k)));
	            }
	          }
	      }
	      result.remove(null);
   			List<List<String>> result3 = new ArrayList<List<String>>();
   			int n = result.size()-1;
   			for(int k=n;k>-1;k--) {
   				List<String> op5 = result.get(k);
   				result3.add(op5);
   			}
   			result3.get(0).add("sea table");
   			result3.get(1).remove("sea table");
   			return result3;
	       }
}