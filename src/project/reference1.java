package project;

//Code to illustrate Soft reference
import java.lang.ref.SoftReference;
class Gfg
{
	//code..
	public void x()
	{
		System.out.println("GeeksforGeeks1");
	}
}

public class Example
{
	public static void main(String[] args)
	{
		// Strong Reference
		Gfg g = new Gfg(); 
		//g.x();
		
		// Creating Soft Reference to Gfg-type object to which 'g' 
		// is also pointing.
		SoftReference<Gfg> softref = new SoftReference<Gfg>(g);
		
		// Now, Gfg-type object to which 'g' was pointing
		// earlier is available for garbage collection.
		g = null; 
		
		// You can retrieve back the object which
		// has been weakly referenced.
		// It succesfully calls the method.
		long startTime = System.currentTimeMillis();
		int i=0;
		while(i<10000000){
		    g = softref.get(); 
		    i++;
		    
		}
		g = softref.get(); 
		
		g.x();
  long endTime   = System.currentTimeMillis();
long totalTime = endTime - startTime;
System.out.println(totalTime);
	}
}
