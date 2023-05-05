package collection_programs;
import java.util.LinkedList;
import java.util.Vector;

public class ExampleforLinkedlist {
	public static void main(String[] args) {
		LinkedList a = new LinkedList(); 
		a.add(10);    
		a.add(10);
		a.add(23.6);
		a.add('e');
		a.add("Roshan");
		a.add(null);
		a.add("Kumar");
		System.out.println(a);
		LinkedList<Integer>b=new LinkedList<Integer>();
		b.add(10);    
		b.add(10);
		b.add(23);
		b.add(70);
		b.add(50);
		b.add(60);
		System.out.println(b);
		
	
	}

}
