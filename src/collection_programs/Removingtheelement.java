package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class Removingtheelement {
	public static void main(String[] args) {
		List<String>s= new ArrayList<String>();
		s.add("Red");
		s.add("Blue");
		s.add("White");
		s.add("Green");
		System.out.println(s);
		s.remove(2);
		System.out.println(s);
	}

}
