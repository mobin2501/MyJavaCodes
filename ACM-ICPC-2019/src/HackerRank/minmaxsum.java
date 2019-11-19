package HackerRank;
import java.util.*;
//import java.util.Scanner;
//import java.util.Arrays;


public class minmaxsum {
	public static void minmax (long[] a) {
		long min=0,max=0;
		for(int i=0;i<a.length-1;i++) {
			min=min+a[i];	
		}
		for(int i=a.length-1;i>0;i--) {
			max=max+a[i];
		}
		System.out.println(min+" "+max);
	}
	public static void main(String args[]) {
		//ArrayList<Integer> a=new ArrayList<Integer>();
		long[] a= new long[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		s.close();
		Arrays.sort(a);
		minmax(a);
		
		
		
		
		
	}

}
