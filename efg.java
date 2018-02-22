package project;
import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class efg {

	public static void main(String[] args) throws NumberFormatException, IOException {
	//public static List<List<String>> createWorkflowStages(List<List<String>> precursorSteps) {
	  ArrayList<ArrayList<String>> precursorSteps =new ArrayList<ArrayList<String>>();
		 ArrayList<String> op2 = new ArrayList<String>();
		 op2.add("clean");
		 op2.add("build");
		 precursorSteps.add(op2);
		 ArrayList<String> op3 = new ArrayList<String>();
		 op3.add("metadata");
		 op3.add("binary");
		 precursorSteps.add(op3);
		 ArrayList<String> op4 = new ArrayList<String>();
		 op4.add("build");
		 op4.add("link");
		 precursorSteps.add(op4);
		 ArrayList<String> op5 = new ArrayList<String>();
		 op5.add("link");
		 op5.add("binary");
		 precursorSteps.add(op5);
		 ArrayList<String> op6 = new ArrayList<String>();
		 op6.add("clean");
		 op6.add("metadata");
		 precursorSteps.add(op6);
		 ArrayList<String> op7 = new ArrayList<String>();
		 op7.add("build");
		 op7.add("resources");
		 precursorSteps.add(op7);
		 System.out.println(precursorSteps);
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
    // IMPLEMENTATION GOES HERE
    System.out.println( printResult(dataset));
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

  // START TEST CASES
  //
  // You can add test cases below. Each test case should be an instance of Test
  // constructed with:
  //
  // Test(String name, List<List<String>> input, List<List<String>> expectedOutput);
}
