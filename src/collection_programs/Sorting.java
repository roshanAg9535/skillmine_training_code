package collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		List<String>s= new ArrayList<String>();
		s.add("Red");
		s.add("Blue");
		s.add("White");
		s.add("Green");
		System.out.println(s);
		//collections class from the util package has the function sort() which we can use.
		Collections.sort(s);

	System.out.println(s);}

}
