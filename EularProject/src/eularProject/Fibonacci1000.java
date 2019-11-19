package eularProject;
import java.util.*;
import java.math.*;

public class Fibonacci1000 {
	public static void main(String args[]) {
		ArrayList<BigInteger> array=new ArrayList<BigInteger>();
		array.add(BigInteger.ZERO);
		array.add(BigInteger.ONE);
		int i;
		for(i=0;;i++) {
			BigInteger c=BigInteger.ZERO;
			c=c.add(array.get(i));
			c=c.add(array.get(i+1));
			array.add(c);
			if(array.get(i).toString().length()>=1000) {
				break;
			}
		}
		System.out.println(i);
		System.out.println(array.get(i));
		System.out.println(array.get(i).toString().length());
	}

}
