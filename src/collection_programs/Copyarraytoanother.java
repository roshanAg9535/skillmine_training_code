package collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Copyarraytoanother {
		public static void main(String[] args) {
			List<String>s= new ArrayList<String>();
			s.add("Red");
			s.add("Blue");
			s.add("White");
			s.add("Green");
			System.out.println(s);
			List<String>t= new ArrayList<String>();
			t.add("1");
			t.add("2");
			t.add("3");
			t.add("4");
			System.out.println(t);
			//to copy the one list in to another
			Collections.copy(s, t);
			System.out.println(s);
			System.out.println(t);
			//to reverse the particular list
			Collections.reverse(t);
			System.out.println(t);
			//to take the slice from the list
		List<String> sub=	s.subList(0, 2);
		System.out.println(sub);
			
	}

}
