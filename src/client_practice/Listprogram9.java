package client_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Listprogram9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>l=new ArrayList<Integer>();
		System.out.println("add all elements");
		for(int i=0;i<4;i++ )
		{
			l.add(sc.nextInt());
		}
		System.out.println(l);
		System.out.println("After reversing");
		Collections.reverse(l);
		System.out.println(l);
		
}

}
