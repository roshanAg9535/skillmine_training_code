package array_programs;

import java.util.Scanner;

public class Arraydeclarationandprintingforwardandreverseindexvaluesandboundaryoutofindex {
public static void main(String[] args) {
	//types of array declaration and string
	int a[] = {};//empty array of size unlimited
	int b[] = new int[5];//empty array b of size 5
	char ch[] = new char[10];//a character array of size 10
	
	//array declaration and initialization at same time
	int c[] = { 11,22,33,44,55,66,77,88,99};
	int f[] = {55,33,66,88,22,11};
	//it does not matter if the array symbol [] is in left or right of the variable name
	
	//array index always starts with zero 
	System.out.println(c[0]);
	
	//printing the entire array using for loop
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	System.out.println("printing the array in reverse:-");
	for(int i=c.length-1;i>0;i--)
	{
		System.out.print(c[i]+" ");
	}
	//printing array using enhanced for-loop/ also called as for each loop
	System.out.println("\n_____________\n printing array using enhanced for loop\n");
	int a1[] = {11,22,33,44,55,66,77,88,99,111};
	for(int i:a1)
	{
		System.out.println(i+" ");
	}
	//multidimentional arrrays /jagged arrays
	int [] [] matrix  = new int [2][3];
	System.out.println("Enter values into the 2 d array ,2 rows and 3 column , total 6 elements to be put in the array ");
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			matrix[i][j]=sc.nextInt();
		}
	}
	System.out.println("Entered matrix is");
	for(int i =0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
	}
}
}
