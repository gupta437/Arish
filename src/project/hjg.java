package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hjg {

}
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