package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoarray {
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
		ArrayList<String> l = new ArrayList<String>();
		l.addAll(t);
		l.addAll(s);
		System.out.println(l);
		
	}

}
