package collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SwappingELementusingindex {
	public static void main(String[] args) {
		List<String>s= new ArrayList<String>();
		s.add("Red");
		s.add("Blue");
		s.add("White");
		s.add("Green");
		System.out.println(s);
		Collections.swap(s, 0, 1);
		System.out.println(s);
		ArrayList al = new ArrayList ();
		al.add("name");
		al.add(6);
		al.add('r');
		for(Object a:al)
		{
			System.out.println(a);
		}
		System.out.println("reading all the element by usiing the iterator method ");
		Iterator it =al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());//it will print and will go to the next line 
		}
		al.addAll(s);
		System.out.println(al);
		
		al.removeAll(s);
		System.out.println(al);
		
	}

}
