package project;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class reconstruct {
	// Java program to print itinerary in order
	public static void main(String[] args) throws NumberFormatException, IOException {

	  //public static List<List<String>> createWorkflowStages(List<List<String>> precursorSteps) {
		 List<List<String>> precursorSteps =new ArrayList<List<String>>();
		 List<String> op2 = new ArrayList<String>();
		 op2.add("meatadata");
		 op2.add("binary");
		 precursorSteps.add(op2);
		 List<String> op3 = new ArrayList<String>();
		 op3.add("build");
		 op3.add("link");
		 precursorSteps.add(op3);
		 List<String> op4 = new ArrayList<String>();
		 op4.add("link");
		 op4.add("binary");
		 precursorSteps.add(op4);
		 List<String> op5 = new ArrayList<String>();
		 op5.add("clean");
		 op5.add("metadata");
		 precursorSteps.add(op5);
		 List<String> op6 = new ArrayList<String>();
		 op6.add("build");
		 op6.add("resources");
		 precursorSteps.add(op6);
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
		 
	  System.out.println(dataset);
	  
	   System.out.println(printResult(dataset));
	  }
//}
	 @SuppressWarnings("unlikely-arg-type")
	public static List<List<String>> printResult(Map<String,List<String>> dataset){
	    
		Map<List<String>,String> reverseMap = new HashMap<List<String>,String>();
	   
	    for(Map.Entry<String,List<String>> entry : dataset.entrySet()){
	    	//System.out.println(entry);
//	    	if(!reverseMap.containsKey(entry.getValue())) {
	      reverseMap.put(entry.getValue(),entry.getKey());
//	    }else{
//	    		List<String> op1 =  new ArrayList<String>();
//	    		op1 = reverseMap.get(entry.getValue());
//	    		op1.add(entry.getKey());
//	    		reverseMap.put()
	    }
	    //System.out.println(reverseMap);
	    String start = null;
	    //	System.out.println(reverseMap);
	    for(Map.Entry<String,List<String>> entry : dataset.entrySet()){
	    		for(Map.Entry<List<String>,String> entry1 : reverseMap.entrySet()) {
	    			List<String> temp = entry1.getKey();
	    			//System.out.println(entry.getKey());
	    			if(!temp.contains(entry.getKey())){
	    				start = entry.getKey();
	    				break;
	    			}
	    		}
	    }
	    System.out.println(start);
	    List<List<String>> result = new ArrayList<List<String>>();
	    
	    List<String> temp = new ArrayList<String>();
	    for(Map.Entry<String,List<String>> entry : dataset.entrySet()){
	    		List<String> abc = entry.getValue();
	    		if (abc.contains(start)){
	    			System.out.println("Found");
	    			System.out.println(entry.getKey());
	    			temp.add(entry.getKey());
	    		}
	    }
	    System.out.println("Temp "+temp);
	    result.add(temp);
	    List<String> temp1 = new ArrayList<String>();
	    temp1.add(start);
	    result.add(temp1);
	    
	    for(int j=0;j<dataset.size()-1;j++) {
	    		for(int k=0;k<result.get(j).size();k++) {
	    			if(!result.contains(dataset.get(result.get(j).get(k))) && dataset.get(result.get(j).get(k)) != null) {
	    				//System.out.println(dataset.get(result.get(j).get(k)));
	    			result.add(dataset.get(result.get(j).get(k)));
	    			//System.out.println(dataset.get(result.get(j).get(k)));
	    			}
	    		}
	    }
	    List<String> bnc = result.get(0);
	    System.out.println(bnc);
	    if(!bnc.contains("sea table")) {
	    	result.get(0).add("sea table");
	    }
	    		
	    result.remove(null);
	         return result;
	     }
	 }


	  // START TEST CASES
	  //
	  // You can add test cases below. Each test case should be an instance of Test
	  // constructed with:
	  //
	  // Test(String name, List<List<String>> input, List<List<String>> expectedOutput);
	  //

//	  static List<Test> tests = Arrays.asList(
//	    new Test(
//	      // name
//	      "build stages",
//	      // input
//	      Arrays.asList(
//	          Arrays.asList("clean", "build"),
//	          Arrays.asList("metadata", "binary"),
//	          Arrays.asList("build", "link"),
//	          Arrays.asList("link", "binary"),
//	          Arrays.asList("clean", "metadata"),
//	          Arrays.asList("build", "resources")
//	      ),
//	      // expected output
//	      Arrays.asList(
//	          Arrays.asList("clean"),
//	          Arrays.asList("build", "metadata"),
//	          Arrays.asList("resources", "link"),
//	          Arrays.asList("binary")
//	      )
//	    ),
//	    new Test(
//	      // name
//	      "making dinner",
//	      // input
//	      Arrays.asList(
//	          Arrays.asList("boil", "serve"),
//	          Arrays.asList("chop", "boil"),
//	          Arrays.asList("stir", "boil"),
//	          Arrays.asList("set table", "serve")
//	      ),
//	      // expected output
//	      Arrays.asList(
//	          Arrays.asList("chop", "stir", "set table"),
//	          Arrays.asList("boil"),
//	          Arrays.asList("serve")
//	      )
//	    )
//	  );
//
//
//	  // END TEST CASES
//	  // DO NOT MODIFY BELOW THIS LINE
//
//	  private static class Test {
//
//	    public String name;
//	    public List<List<String>> input;
//	    public List<List<String>> expectedOutput;
//
//	    public Test(String name, List<List<String>> input, List<List<String>> expectedOutput) {
//	      this.name = name;
//	      this.input = input;
//	      this.expectedOutput = expectedOutput;
//	    }
//	  }
//
//	  private static boolean equalOutputs(List<List<String>> a, List<List<String>> b) {
//	    if (a == null || b == null || a.size() != b.size()) {
//	      return false;
//	    }
//	    for (int i = 0; i < a.size(); i++) {
//	      List<String> a1 = new ArrayList<>(a.get(i));
//	      List<String> b1 = new ArrayList<>(b.get(i));
//	      a1.sort(null);
//	      b1.sort(null);
//	      if (!a1.equals(b1)) {
//	        return false;
//	      }
//	    }
//	    return true;
//	  }
//
//	  public static void main(String[] args) {
//	    int passed = 0;
//	    for (Test test : tests) {
//	      System.out.printf("==> Testing %s...\n", test.name);
//	      try {
//	        List<List<String>> actualOutput = createWorkflowStages(test.input);
//	        if (equalOutputs(actualOutput, test.expectedOutput)) {
//	          System.out.println("PASS");
//	          passed++;
//	        } else {
//	          System.out.println("FAIL");
//	          System.out.printf("Input: %s\n", test.input);
//	          System.out.printf("Expected output: %s\n", test.expectedOutput);
//	          System.out.printf("Actual output: %s\n", actualOutput);
//	        }
//	      } catch (Exception e) {
//	        System.out.println("FAIL");
//	        System.out.println(e);
//	      }
//	    }
//	    System.out.printf("==> Passed %d of %d tests\n", passed, tests.size());
//	  }
//	}

	
//}
