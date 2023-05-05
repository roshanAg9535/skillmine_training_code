package collection_programs;

import java.util.Map;
import java.util.TreeMap;

public class FetchingkeyandvaluepairTreemap {
	public static void main(String[] args) {
		TreeMap <Integer,String> s = new TreeMap<Integer,String>();
		s.put(1, "mom");
		s.put(2, "dad");
		s.put(3, "brother");
		s.put(4, "sister");
		for(Map.Entry<Integer, String> entry : s.entrySet())
		{
			System.out.println(entry.getKey()+" :-"+entry.getValue());
			
		}
		System.out.println(s.firstKey());
		System.out.println(s.lastKey());
		System.out.println(s.pollFirstEntry());
		System.out.println(s.firstEntry());
		System.out.println(s.lastEntry());
	}

}
