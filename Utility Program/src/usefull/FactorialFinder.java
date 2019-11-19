package usefull;
import java.math.*;
import java.util.*;
public class FactorialFinder {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		BigInteger b=new BigInteger("1");
		for(int i=1;i<=n;i++) {
			b=b.multiply(BigInteger.valueOf(i));	
		}
		System.out.println(b);
		s.close();
	}
}
