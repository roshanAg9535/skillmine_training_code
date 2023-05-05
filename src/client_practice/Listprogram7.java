package client_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Listprogram7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		System.out.println("The element before adding");
		for(int i=0;i<5;i++)
		{
			l1.add(i, sc.nextInt());
		}
		
		System.out.println("at which index you want to delete the array element");
		int index = sc.nextInt();
		l1.remove(index);
		System.out.println(l1);
		
		
}

}
