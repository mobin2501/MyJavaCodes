package eularProject;
import java.util.*;

public class LargestPalindromeProduct {
	public static void main(String args[]) {
		ArrayList<Integer> i=new ArrayList<Integer>();
		ArrayList<Integer> j=new ArrayList<Integer>();
		for(int k=100;k<=999;k++) {
			i.add(k);
			j.add(k);
		}
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int k=i.size();k>0;k--) {
			for(int m=j.size();m>0;m--) {
				String p=Integer.toString(i.get(k-1)*j.get(m-1));
				if( p.length()>5) {
					String first=p.substring(0, 3);
					String l=p.substring(3,6);
					StringBuilder las=new StringBuilder();
					String last =las.append(l).reverse().toString();
					
					
					if(last.equals(first)) {
						//System.out.println(i.get(k-1)+" "+j.get(m-1)+" "+p);
						al.add(Integer.parseInt(p));
					}
				}
				
			}
		}
		int largest=al.get(0);
		for(int k=0;k<al.size();k++) {
			if(largest<al.get(k)) {
				largest=al.get(k);
			}
		}
		System.out.println(largest);
		
	}

}
