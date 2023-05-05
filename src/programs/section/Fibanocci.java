package programs.section;

import java.util.Scanner;

public class Fibanocci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number up to which we want fibanocci series");
		int fb = sc.nextInt();
		int ft = 0;
		int st =1;
		for(int i =0;i<fb;i++)
		{
			System.out.print(ft+",");
			int nt = ft+st;
			ft=st;
			st=nt;
		}
				
	}

}
