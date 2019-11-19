package HackerRank;
import java.util.*;

public class gradingstudent {
	public static void main(String args[])throws Exception {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		if(n>=1 && n<=100) {
			for(int i=0;i<n;i++) {
				if(ar[i]>=0 && ar[i]<=100) {
					if(ar[i]%5>=3 && ar[i]>=38) {
						System.out.println(ar[i]+5-(ar[i]%5));
					}
					else {
						System.out.println(ar[i]);
					}
				}
			}
		}
		s.close();
		
	}
	

}
