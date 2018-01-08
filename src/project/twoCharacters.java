package project;
import 	java.util.Hashtable;
import java.util.Set;

public class twoCharacters {
	public static void main(String[] args) {
		String s = 	"beabeefeab";
		 StringBuffer sb = new StringBuffer(s);
		    StringBuffer output = new StringBuffer();
		    for(int i=1; i<sb.length();i++){
		        if(sb.charAt(i-1)==sb.charAt(i)){
		            for(int j=0;j<sb.length();j++){    
		                if(sb.charAt(i) != sb.charAt(j)) {
		                // If it is not the same, append it.
		                output.append(sb.charAt(j));
		                }
		            }
		            i=0;
		            sb = output;
		        }
		    }
		    
		    Hashtable<Character,Integer> tb = new Hashtable<Character,Integer>();
		    for(int i=0;i<output.length();i++) {
		    		if(tb.containsKey(output.charAt(i))){
		    			tb.put(output.charAt(i), tb.get(output.charAt(i))+1);
		    		}else {
		    			tb.put(output.charAt(i), 1);
		    		}
		    }
		    sb=output;
		    StringBuffer op = new StringBuffer();
		    Set<Character> keys = tb.keySet();
			Character[] array = keys.toArray(new Character[0]);
			for(Character K:array) {
				if(tb.get(K) == 1) {
					for(int i=0; i<sb.length();i++) {
						if(sb.charAt(i)!=K) {
							op.append(sb.charAt(i));
						}
					}
					sb=op;
				}
			}
		    System.out.println(sb);
	}
}
