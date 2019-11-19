package javapractice;
import java.util.*;

public class stdinstdout {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String stri=s.nextLine();
		int i=Integer.parseInt(stri);
		String strd=s.nextLine();
		double d=Double.parseDouble(strd);
		String str=s.nextLine();
		s.close();
		System.out.println("String "+str);
		System.out.println("Double: "+d);
		System.out.println("Int: "+i);
	}

}
