package cse2201;

public class QuickSort {
	public static int partition(int[] a,int p, int r) {
		int x=a[p];
		int i=p;
		for(int j=p+1;j<r;j++) {
			if(a[j]<=x) {
				i=i+1;
				int tem=a[j];
				a[j]=a[i];
				a[i]=tem;
			}
		}
		int tem=a[p];
		a[p]=a[i];
		a[i]=tem;
		return i;
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
		
		quicksort(a,0,r);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}

}
