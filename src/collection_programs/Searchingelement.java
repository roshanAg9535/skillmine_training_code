package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class Searchingelement {
	public static void main(String[] args) {
		List<String>s= new ArrayList<String>();
		s.add("Red");
		s.add("Blue");
		s.add("White");
		s.add("Green");
		System.out.println(s);
		if(s.contains("black"))
			System.out.println("found element");
		else
			System.out.println("not found");
	}

}
