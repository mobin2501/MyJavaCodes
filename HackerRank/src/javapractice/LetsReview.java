package javapractice;
import java.util.*;

public class LetsReview {
	public static void main(String args[]) {
		List<String> str=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.nextLine();
		for(int i=0;i<a;i++) {
			str.add(s.nextLine());
		}
		for(int j=0;j<a;j++) {
			for(int i=0;i<str.get(j).length();i=i+2) {
				System.out.print(str.get(j).charAt(i));
			}
			System.out.print(" ");
			for(int i=1;i<str.get(j).length();i=i+2) {
				System.out.print(str.get(j).charAt(i));
			}
			System.out.println();
		}
		s.close();
		
	}

}
