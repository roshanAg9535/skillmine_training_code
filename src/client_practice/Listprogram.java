package client_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Listprogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		System.out.println("add element");
		for(int i=0;i<5;i++)
		{
			l1.add(sc.nextInt());
		}
		System.out.println(" Enter the element you want to check ");
		int element = sc.nextInt();
		if(l1.contains(element))
		{
			System.out.println("The "+element+" is existng");
		}
		else
		{
			System.out.println("The "+element+" does not exist");
		}
}

}
