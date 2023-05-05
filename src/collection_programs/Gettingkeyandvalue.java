package collection_programs;

import java.util.HashMap;

public class Gettingkeyandvalue {
	public static void main(String[] args) {
		HashMap<Integer,String>s = new HashMap<Integer,String>();
		s.put(1, "mom");
		s.put(2, "dad");
		s.put(3, "brother");
		s.put(4, "sister");
		//to get the value at a particular key
		String val =(String)s.get(3);
		System.out.println("value for the key3 is :" + val);
		//printing all the keys using keyset() 
		System.out.println(s.keySet());
		System.out.println(s.values());
	}

}
