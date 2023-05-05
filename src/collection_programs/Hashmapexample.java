package collection_programs;

import java.util.HashMap;
import java.util.Map;

public class Hashmapexample {
	public static void main(String[] args) {
		HashMap<Integer,String>s = new HashMap<Integer,String>();
		s.put(1, "mom");
		s.put(2, "dad");
		s.put(3, "brother");
		s.put(4, "sister");
		for(Map.Entry x:s.entrySet())
		{
			System.out.print(x.getKey() +" "+x.getValue());
		}
		System.out.println(s.size());
		HashMap<Integer,String>s1 = new HashMap<Integer,String>();
		s1.put(1, "wife");
		s1.put(2, "gf");
		s1.put(3, "bf");
		s1.put(4, "dead");
		s.putAll(s1);
		System.out.println(s1);
		System.out.println(s);
		boolean result = s1.isEmpty();
		System.out.println(result);
		s1.clear();
		boolean result1 = s1.isEmpty();
		System.out.println(result1);
		
	} 

}
