package practice;
import java.util.*;

public class SeaBattle {
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		int w1=s.nextInt();
		int h1=s.nextInt();
		int w2=s.nextInt();
		int h2=s.nextInt();
		int lc=h1+h2+2;
		int bc=w1+1;
		int rc=h1+h2+1;
		int uc=w2;
		int cc=w1-w2;
		int totalCell=lc+bc+rc+uc+cc;
		System.out.println(totalCell);
		s.close();
		
		
	}

}
