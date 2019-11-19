
import java.util.*;
public class quicksort {
	public static int partition(int a[],int p,int r) {
		int x=a[r];
		int i=p-1;
		for(int j=p;j<r;j++) {
			if(a[j]<=x) {
				i++;
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		return i+1;
		
	}
	public static void qsrt(int[] a,int p,int r) {
		if(p<r) {
			int q=partition(a,p,r);
			qsrt(a,p,q-1);
			qsrt(a,q+1,r);
		}
		
		
	}
	public static void main(String args[]) {
		int b[]= {2,8,7,1,3,5,6,4};
		System.out.println(Arrays.toString(b));
		qsrt(b,0,b.length-1);
		System.out.println(Arrays.toString(b));
		
		
		
	}

}
