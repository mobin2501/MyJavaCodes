package eularProject;

import java.util.ArrayList;

public class SummationOfPrimes {
	public static void main(String args[]) {
		ArrayList<Long> al=new ArrayList<Long>();
		for(long i=1;;i+=2) {
			al.add(i);
			for(int j=3;j<i;j+=2) {
				if((i%j==0)) {
					al.remove(al.size()-1);
					
					break;
				}
				
			}
			if(al.get(al.size()-1)>100) {
				break;
			}
			
		}
		long sum=0;
		for(int i=0;i<al.size()-1;i++) {
			sum=sum+(long)al.get(i);
			System.out.println(al.get(i));
		}
		System.out.println(sum+1);
	}

}
