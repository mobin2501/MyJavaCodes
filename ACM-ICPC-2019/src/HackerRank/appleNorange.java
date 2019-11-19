package HackerRank;
import java.util.*;

public class appleNorange {
	public static void main(String args[] ){
		Scanner input=new Scanner(System.in);
		int s=input.nextInt();
		int t=input.nextInt();
		int a=input.nextInt();
		int b=input.nextInt();
		int m=input.nextInt();
		int n=input.nextInt();
		int[] dm=new int[m];
		int[] dn=new int[n];
		for(int i=0;i<m;i++) {
			dm[i]=input.nextInt();
		}

		for(int i=0;i<n;i++) {
			dn[i]=input.nextInt();
		}
		input.close();
		int apple=0;
		int orange=0;
		if(a<s && s<t && t<b) {
			for(int i=0;i<m;i++) {
				if(a+dm[i]>=s && a+dm[i]<=t) {
					apple++;
				}
			}
			for(int i=0;i<n;i++) {
				if(b+dn[i]>=s && b+dn[i]<=t) {
					orange++;
				}
			}
		}
		System.out.println(apple);
		System.out.println(orange);
		
	}

}
