package eularProject;
import java.util.Scanner;
//Didn't finished this work . Won't work .
public class HighlyDivisibleTriangularNumber2 {
	public static int s2(int i) {
		int n=(int)(Math.pow((double)i, 2));
		return n;
	}
	public static int sqr(int i) {
		int n=(int)Math.ceil(Math.sqrt((double)i));
		return n;
	}
	public static void check(int num) {
		int a=(int)(sqr(num));
		for(int i=a;;i++) {
			int a2=s2(i);
			int b2=a2-num;
			int b=sqr(b2);
			int b22=s2(b);
			if((s2(i)-s2(i-1))>num){
	        	System.out.println("Can't do a2-b2 for "+num);
	        	break;
	        }
	        if(b22==b2) {
	        	System.out.println(a2+"-"+b22);
	        	System.out.println(i+"^2 -"+b+"^2");
	        	//check(i);
	        	//check(b);
	        	break;
	        }
	        
		}
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		check(num);
		s.close();
		
	}

}
