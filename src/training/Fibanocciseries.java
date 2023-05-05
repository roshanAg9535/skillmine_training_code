package training;

import java.util.Scanner;

public class Fibanocciseries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number up to which we want to check the fibannoci series ");
		int n = sc.nextInt();
		int ft =-1;
		int st =1;
		for(int i=1;i<=n;i++) {
			int nt = ft+st;
			System.out.print(nt+",");
			ft=st;
			st=nt;
	}
	}
}
