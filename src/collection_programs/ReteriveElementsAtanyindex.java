package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class ReteriveElementsAtanyindex {
	public static void main(String[] args) {
		List<String>s= new ArrayList<String>();
		s.add("Red");
		s.add("Blue");
		s.add("White");
		s.add("Green");
		System.out.println(s);
		//Retrive the first and third element
		String element = s.get(0);
		String element1 = s.get(1);
		System.out.println(element);
		System.out.println(element1);
	}


}
