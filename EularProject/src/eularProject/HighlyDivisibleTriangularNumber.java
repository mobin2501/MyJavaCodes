package eularProject;
import java.util.ArrayList;

//time complexity is way high . n^2 . slight modification can bring n^2/c but it's not good enough.
//76576500
//562
public class HighlyDivisibleTriangularNumber {
	public static void main(String args[]) {
		
		long j=0;
		long count=0;
		for(long i=1;;i++) {
			j=j+i;
			
			ArrayList<Integer> al=new ArrayList<Integer>();
			for(int k=1;k<=j/16;k++) {
				count++;
				if(j%k==0) {
					
					al.add(k);
				}
				
			}
			if(al.size()>466){
				System.out.println(j);
				System.out.println(al.size());
				System.out.println(al);
				break;
				
			}
		}
		System.out.println(count);
		
	}

}
