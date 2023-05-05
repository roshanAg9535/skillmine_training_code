package sorting_techniques;

public class SelectionSort {
	public static int min(int a[] , int i) {
		int minvalue = a[i];
		int minindex = i;
		for( int j = i+1; j< a.length; j++) {
			if( minvalue > a[j]) {
				minvalue = a[j];
				minindex = j;
			}
		}
		return minindex;
	}

	public static void main(String[] args) { 
        int a[] = {7,2,4,9,1,3,6};  
        int minindex = 0;
        for(int i = 0; i< a.length; i++){
        minindex = min(a, i);       
        int t = a[i];
        a[i] = a[minindex];
        a[minindex] = t;
        }
        
        // printing the sorted array. \\
        for(int i =0; i< a.length; i++) {
        	System.out.print(a[i]+" ");
        }
	}
}