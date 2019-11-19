package javapractice;
import java.util.*;
public class printmulti {
	public static void multi(int a ,int b) {
		System.out.println(a+" x "+b+" = "+a*b);
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a =s.nextInt();
		for(int i=1;i<=10;i++) {
			multi(a,i);
		}
		s.close();
		
	}

}
