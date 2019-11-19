package eularProject;


public class LongestCollatz2 {
	public static void main(String args[]) {
		//ArrayList<Integer> al=new ArrayList<Integer>();
		int a=1;
		int col=0;
		for(int i=1;i<1000000;i++) {
			long n=i;
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
			System.out.println(i+" "+b);
			if(a<b) {
				a=b;
				col=i;
				
			}
			
		}
		//System.out.println(al.size());
		System.out.println("Calculation Done !");
		System.out.println(a+" "+col);
		
		
		
	}

}
