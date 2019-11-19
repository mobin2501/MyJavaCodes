package eularProject;
import java.util.*;
//This is the most ingenious code I've ever written (till 2.14.2019).
//On 12.39 (2.15.2019) I realized it would take n/2+m^2 iterations . Boy oh boy , n is huge . 
//Use part 2 then part 1 
public class Largestprimefactor {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		long value=s.nextLong();
		ArrayList<Long> al=new ArrayList<Long>();
		for(long i=1;i<value;i+=2) {
			if(i>1 && value%i==0) {
				al.add(i);
			}
		}
		
		s.close();
		
		for(int i=0;i<al.size();i++) {
			for(int j=al.size()-1;j>=0;j--) {
				if(al.get(j)%al.get(i)==0 && al.get(j)>al.get(i)) {
					
					al.remove(j);
					
				}
			}
			
			
			
		}
		
		System.out.println();
		System.out.println(al);
	}
	

}
