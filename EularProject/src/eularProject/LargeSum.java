package eularProject;
import java.util.*;

import java.math.BigInteger;
//It's works fine but apparently I understood the question wrong. Check 2
//Turns out it works .
public class LargeSum {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		ArrayList<BigInteger> str=new ArrayList<BigInteger>();
		for(int i=0;i<100;i++) {
			str.add(s.nextBigInteger());
		}
		BigInteger sum=new BigInteger("0");
		for(int i=0;i<100;i++) {
			sum=sum.add(str.get(i));
		}
		System.out.println(String.valueOf(sum).substring(0,10));
		s.close();
	}

}
