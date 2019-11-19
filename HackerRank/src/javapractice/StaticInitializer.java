package javapractice;
import java.util.*;

public class StaticInitializer {
	static int B,H;
	static boolean flag=true;
	static {
		Scanner s=new Scanner(System.in);
		B=s.nextInt();
		H=s.nextInt();
		s.close();
		if((B<0 || H<0) || B>=100 || H>=100) {
			flag=false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			
		}
		
		else {
			flag=true;
		}
	}
	
	public static void main(String args[]) {
		
		if(flag) {
			System.out.println(B*H);
		}
	}

}
