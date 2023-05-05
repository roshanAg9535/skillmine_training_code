package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class Clone {
	public static void main(String[] args) {
		ArrayList<String>t= new ArrayList<String>();
		t.add("Red");
		t.add("Blue");
		t.add("White");
		t.add("Black");
		System.out.println(t);
		ArrayList<String> c = (ArrayList<String>)t.clone();
		System.out.println(c);
		t.removeAll(t);
		System.out.println(t);
		
	}

}
