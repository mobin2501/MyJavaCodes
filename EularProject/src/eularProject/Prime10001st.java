package eularProject;
import java.util.*;
public class Prime10001st {
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;;i+=2) {
			al.add(i);
			for(int j=3;j<i;j+=2) {
				if((i%j==0)) {
					al.remove(al.size()-1);
					//System.out.println(al.size());
					break;
				}
				
			}
			if(al.size()>10000) {
				break;
			}
		}
		System.out.println(al.get(al.size()-1));
		
	}

}
