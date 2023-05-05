package client_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Listprogram6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		System.out.println("The element before adding");
		for(int i=0;i<5;i++)
		{
			l1.add(i, sc.nextInt());
		}
		System.out.println("add the element you want ");
		int element = sc.nextInt();
		System.out.println("at which index");
		int index = sc.nextInt();
		l1.add(index, element);
		System.out.println(l1);
		
		
		
}

}
