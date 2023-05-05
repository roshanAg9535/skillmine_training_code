package collection_programs;
//it will allow duplicate 
//it will maintain inseration order , so we can fetch it by using index                  
import java.util.ArrayList;
import java.util.Vector;

public class ExampleforVector {
	public static void main(String[] args) {
		Vector a = new Vector(); //if we enter new element it will increase 100%
		a.add(10);    
		a.add(10);
		a.add(23.6);
		a.add('e');
		a.add("Roshan");
		a.add(null);
		a.add("Kumar");
		System.out.println(a);
		Vector<Integer>b=new Vector<Integer>();
		b.add(10);    
		b.add(10);
		b.add(23);
		b.add(50);
		b.add(40);
		b.add(null);
		b.add(60);
		System.out.println(b);
		
	
	}

}
