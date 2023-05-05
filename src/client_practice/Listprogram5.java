package client_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Listprogram5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		System.out.println("add element");
		for(int i=0;i<5;i++)
		{
			l1.add(sc.nextInt());
		}
		//sorting in ascending order
		Collections.sort(l1);
		System.out.println(l1);
		//sorting in descending order
	     Collections.sort(l1,Collections.reverseOrder());
	     System.out.println(l1);
		
}

}
