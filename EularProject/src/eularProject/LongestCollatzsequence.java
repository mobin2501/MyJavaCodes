package eularProject;
import java.util.*;

public class LongestCollatzsequence {
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		
		for(int i=1;i<1000;i++) {
			al.add(i);
			for(int j=0;;j++) {
		
				if(al.get(j)%2!=0) {
					
					int n=al.get(j)*3+1;
					al.add(n);
					if(n==1) {
					  h.put(al.size(),al.get(0));
					  al.clear();
					  break;
					}
				}
				else {
					
					int n=al.get(j)/2;
					al.add(n);
					if(n==1) {
						h.put(al.size(),al.get(0));
						al.clear();
						break;
					}
				}
			}
			
			
		}
		
		System.out.println(h.values());
		
	}

}
