package training;

public class Binarysearch {
public static void main(String[] args) {
	int a[] = {10,20,30,40,50,60};
	int itemtosearch = 60;
	int start =0;
	int end = a.length; boolean search = false;int index =0;
	while(start<end)
	{
		int mid = (start+end)/2;
		if(itemtosearch==a[mid])
		{
			search = true;
			index = mid;
			break;
		}
		else if(itemtosearch<a[mid])
		{
			end = mid-1;
		}
		else
		{
			start = mid+1;
		}
	}
	if(search == true)
	{
		System.out.print("The item "+itemtosearch+" is at index "+index);
	}
	else
	{
		System.out.println("The item you are serching is not present in the list ");
	}
}
}
