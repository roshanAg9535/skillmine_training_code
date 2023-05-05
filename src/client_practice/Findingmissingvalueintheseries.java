package client_practice;

public class Findingmissingvalueintheseries {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70,90,100};
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		int sum2=0;
		for(int i=10;i<=100;i=i+10)
		{
			sum2 = sum2+i;
		}
		System.out.println("The missing number is "+(sum2-sum1));
	}

}
