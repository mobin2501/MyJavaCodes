package cse2201;
import java.util.*;
public class QuicksortRightPivot {
	public static int partition(int[] a,int p, int r) {
		int x=a[r];
		int i=p-1;
		for(int j=p;j<r;j++) {
			if(a[j]<=x) {
				i++;
				int tem=a[j];
				a[j]=a[i];
				a[i]=tem;
			}
		}
		int tem=a[i+1];
		a[i+1]=a[r];
		a[r]=tem;
		return i+1;
	}
	public static void quicksort(int[] a, int p, int r) {
		if(p<r) {
			int q=partition(a,p,r);
			quicksort(a,p,q-1);
			quicksort(a,q+1,r);
			
		}
	}
	
	public static void main(String args[]) {
		int[] a= {6,10,13,5,8,3,2,11};
		int r=a.length-1;
		System.out.println(Arrays.toString(a));
		quicksort(a,0,r);
		System.out.println(Arrays.toString(a));
	}
	
	

}
