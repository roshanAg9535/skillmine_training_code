package client_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Listprogram4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		System.out.println("add element");
		for(int i=0;i<5;i++)
		{
			l1.add(sc.nextInt());
		}
		System.out.println(l1);

}

}
