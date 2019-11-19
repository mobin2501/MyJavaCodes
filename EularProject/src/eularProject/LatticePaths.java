package eularProject;
import java.math.*;

public class LatticePaths {
	public static void main(String args[]) {
		//Lattice paths of n*m =n!/(m!*m!)
		BigInteger b=new BigInteger("1");
		BigInteger c=new BigInteger("1");
		for(int i=1;i<=40;i++) {
			b=b.multiply(BigInteger.valueOf(i));	
		}
		for(int i=1;i<=20;i++) {
			c=c.multiply(BigInteger.valueOf(i));
		}
		BigInteger d=b.divide(c).divide(c);
		System.out.println(d);
		
	}

}
