package eularProject;
import java.math.BigInteger;

public class Factof100 {
	
	public static void main(String[] args) {
		BigInteger a;
		a=BigInteger.ONE;
		int sum=0;
		for(int i=1;i<=100;i++) {
			
			a=a.multiply(BigInteger.valueOf(i));
			//System.out.println(i+" "+a);
		}
		System.out.println(a.toString().length());
		for(int i=0;i<=157;i++) {
			System.out.println((int)a.toString().charAt(i)-48);
			sum=sum+(int)a.toString().charAt(i)-48;
		}
		
		System.out.println(sum);
		
	}

}
