package client_practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Listprogram8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		System.out.println("Add the element");
		for(int i=0;i<4;i++)
		{
			l1.add(sc.nextInt());
		}
		//converting the linked list in to array list 
		List<Integer>l=new ArrayList<Integer>(l1);
		for(int a: l)
		{
			System.out.println(a);
		}
		
		
}

}
