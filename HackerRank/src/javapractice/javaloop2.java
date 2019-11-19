package javapractice;
import java.util.*;
import java.lang.Math;

public class javaloop2 {
	public static int sumb(int b,int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=(int)Math.pow(2,i)*b+sum;
		}
		return sum;
	}
	
	public static void main(String args[]) {
	
		Scanner s =new Scanner(System.in);
		int q=s.nextInt();
		
		for(int i=0;i<q;i++) {
			int a =s.nextInt();
			int b =s.nextInt();
			int n =s.nextInt();
			for(int j=0;j<n;j++) {
				System.out.print(a+sumb(b,j)+" ");
			}
			System.out.print("\n");
		}
		s.close();
	}

}
