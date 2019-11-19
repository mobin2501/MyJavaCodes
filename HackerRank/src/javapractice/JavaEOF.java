package javapractice;
import java.util.*;

public class JavaEOF {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int i=1;
		while(s.hasNext()) {
			
			String line=s.nextLine();
			System.out.println(i+" "+line);
			i++;
		}
		s.close();
	}

}
