package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class Replacelement {
	public static void main(String[] args) {
		List<String>t= new ArrayList<String>();
		t.add("Red");
		t.add("Blue");
		t.add("White");
		t.add("Black");
		System.out.println(t);
		String g = "Pink";
		t.set(0, g);
		System.out.println(t);
		int num = t.size();
		for(int i=0;i<num;i++)
		{
			System.out.println(t.get(i));
		}
		
	}

}
