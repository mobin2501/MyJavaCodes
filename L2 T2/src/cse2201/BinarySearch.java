package cse2201;

public class BinarySearch {
	public static void bis(int[] arr,int l,int r,int n){			
		int m=(l+r)/2;
		if(n==arr[m]) {
			System.out.println(m+ " "+arr[m]);
		}
		else if(n<arr[m]) {
			bis(arr,l,m,n);
			
		}
		else{
			bis(arr,m+1,r,n);
			
		}
	}
	public static void main(String args[]) {
		int[] arr= {3,5,7,8,9,12,15};
		bis(arr,0,arr.length-1,9);
		
	}

}
