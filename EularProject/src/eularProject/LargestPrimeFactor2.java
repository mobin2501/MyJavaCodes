package eularProject;
import java.util.*;


public class LargestPrimeFactor2 {
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		long value =s.nextLong();
		long a =(long)Math.ceil(Math.sqrt((double)value));
		
		for(long i=a;;i++) {
			
			long a2=(long)Math.pow((double)i, 2);
			long b2=a2-value;
			long b=(long)Math.sqrt((double)b2);
			long b22=(long)Math.pow(b,2);
			
			if(b22==b2) {
				long aa=(long)Math.sqrt(a2);
				System.out.println("a2="+a2+" a="+ (long)Math.sqrt(a2)+" b2="+b2+" b="+(long)Math.sqrt(b2));
				System.out.println("a+b="+(aa+b));
				System.out.println("a-b="+(aa-b));
				break;
			}
			
		}
		
		s.close();
	}

}
