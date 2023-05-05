package training;

public class Smallestintegerfromaarray {
	public static void main(String[] args) {
		int arr[]= { 10,50,2,6,7};
		int small =arr[0];
		int index = 0;
		for(int i =1;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small =arr[i];
				index = i;
			}
		}
		System.out.println("The smallest number is : "+" "+small+" "+"is at index number"+" "+index);
	}

}
