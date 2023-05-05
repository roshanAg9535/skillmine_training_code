package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class Comparingarraylist {
	public static void main(String[] args) {
		List<String>s= new ArrayList<String>();
		s.add("Red");
		s.add("Blue");
		s.add("White");
		s.add("Green");
		System.out.println(s);
		List<String>t= new ArrayList<String>();
		t.add("Red");
		t.add("Blue");
		t.add("White");
		t.add("Black");
		System.out.println(t);
		List<String>g = new ArrayList<String>();
		for(String e: s)
		{
			g.add(t.contains(e)? "yes" : "No");
		}
		System.out.println(g);
	}
}
