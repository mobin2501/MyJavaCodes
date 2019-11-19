package eularProject;
import java.util.*;
//I Miss understood again . Check 3 .
public class LargeSum2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> str=new ArrayList<String>();
		for(int i=0;i<100;i++) {
			str.add(s.nextLine());
		}
		long sum=0;
		for(int i=0;i<100;i++) {
			sum=sum+Long.parseLong(str.get(i).substring(0, 10));
			
		}
		System.out.println(sum);
		s.close();
		
	}

}
