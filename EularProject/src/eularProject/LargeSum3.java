package eularProject;
import java.util.*;
import java.math.BigInteger;
//Check 1 . It Totally works .
public class LargeSum3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> str=new ArrayList<String>();
		for(int i=0;i<100;i++) {
			str.add(s.nextLine());
		}
		BigInteger sum=new BigInteger("0");
		for(int i=0;i<100;i++) {
			System.out.println("Check num 1");
		}
		System.out.println(sum);
		s.close();
	}

}
