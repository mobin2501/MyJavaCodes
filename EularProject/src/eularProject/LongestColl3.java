package eularProject;

public class LongestColl3 {
	public static void main(String args[]) {
		long n=999167;
		int b=1;
		for(;;) {
			if(n%2==0) {
				n=n/2;
				
				b++;
			}
			else if(n%2==1) {
				n=3*n+1;
				
				b++;
			}
			if(n==1) {
				
				break;
				
			}
		}
		System.out.println(b);
	
	}

}
