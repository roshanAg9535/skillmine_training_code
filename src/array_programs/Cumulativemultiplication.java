package array_programs;

public class Cumulativemultiplication {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum =0;int c= 1;int num;
		for(int i=0;i<a.length;i++)
		{ 
			
			num=c;
			c=c*a[i];
			System.out.println("The sum of "+num+" * "+a[i]+"is:- "+c);
		}
		System.out.println();
	}

}
