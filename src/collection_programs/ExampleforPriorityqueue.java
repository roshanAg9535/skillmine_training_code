package collection_programs;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ExampleforPriorityqueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> a = new PriorityQueue<Integer>(); 
		a.add(10);    
		a.add(10);
		a.add(23);
		a.add(100);
		a.add(30);
		a.add(50);
		a.add(300);
		System.out.println(a);
//		System.out.println(a.element());
		System.out.println(a.peek());
      Iterator it = a.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
	
	}


}
