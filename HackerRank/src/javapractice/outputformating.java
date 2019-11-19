package javapractice;
import java.util.*;

public class outputformating {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String[] str =new String[3];
		int[] in=new int[3];
		for(int i=0;i<3;i++) {
		    str[i]=s.next();
			in[i]=s.nextInt();
		}
		System.out.println("================================");
		for(int i=0;i<3;i++) {
			System.out.printf("%-15s%03d\n",str[i],in[i]);
		}
		System.out.println("================================");
		s.close();
		
		
		
	}
}
