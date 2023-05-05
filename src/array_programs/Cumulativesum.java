package array_programs;

public class Cumulativesum {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int sum =0;int c= 0;int num;
		for(int i=0;i<a.length;i++)
		{ 
			//pehle zero print karne hai esliye num ma store karenge
			num=c;
			c=c+a[i];
			System.out.println("The sum of "+num+" + "+a[i]+"is:- "+c);
			sum = sum+a[i];
		}
		System.out.println();
		System.out.println(sum);
	}

}
