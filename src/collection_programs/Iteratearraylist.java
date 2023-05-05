package collection_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratearraylist {
	public static void main(String[] args) {
		List<String>s= new ArrayList<String>();
		s.add("Red");
		s.add("Blue");
		s.add("White");
		s.add("Green");
//		System.out.println(s);
		for(String d : s)
		{
			System.out.println(d);
		}
		//using the iterator interfaces iterator() method and hasNext() and next()
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
