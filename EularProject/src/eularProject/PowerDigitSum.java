package eularProject;
import java.math.*;
import java.util.*;
public class PowerDigitSum {
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		BigInteger b=BigInteger.ONE;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=s.nextInt();
		s.close();
		for(int i=1;i<=p;i++) {
			b=b.multiply(BigInteger.valueOf(n));
			
		}
		System.out.println(b);
		System.out.println(b.toString().length());
		int sum=0;
		String str=b.toString();
		for(int i=0;i<b.toString().length();i++) {
			
			sum=sum+Integer.parseInt(str.valueOf(str.charAt(i)));		
		}
		
		System.out.println(sum);
	}

}
