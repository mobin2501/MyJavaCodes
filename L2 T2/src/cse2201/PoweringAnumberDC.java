package cse2201;
import java.util.*;
public class PoweringAnumberDC {
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		
		long a=s.nextLong();
		long n=s.nextLong();
		long b=a;
		s.close();
		for(int i=0;i<n;i++) {
			
			a=a*b;
			
		}
		System.out.println(a);
		
	}

}
