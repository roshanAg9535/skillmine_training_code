package practice;

import java.util.Scanner;

public class Dowhileexample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean asking ;
	do {
		System.out.println("Enter the first number");
		int f1= sc.nextInt();
		System.out.println("Enter the second number");
		int f2 = sc.nextInt();
		System.out.println(f1+f2);
		System.out.println("Do you want to perform the operation again");
	}
	while(asking = sc.nextBoolean());
		
}
}
