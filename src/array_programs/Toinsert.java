package array_programs;

import java.util.Scanner;

public class Toinsert {
public static void main(String[] args) {
	int n , pos , element;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of array element we want");
	 n = sc.nextInt();
	 int a[]= new int [n+1];
	 System.out.println("Enter the arrray element ");
	 for(int i = 0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 System.out.println("Enter the position where we want to insert");
	  pos = sc.nextInt();
	  System.out.println("Enter the element which we want to insert");
	  element = sc.nextInt();
	 for(int i= n-1;i>=pos-1;i--)
	 {
		 a[i+1]=a[i];
	 }
	  a[pos-1]=element;
	  for(int i = 0 ; i<a.length;i++)
	  {
		  System.out.print(a[i]+" ");
	  }
	 
}
}
