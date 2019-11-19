package javapractice;
import java.util.*;


public class Javadatetype {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int q=s.nextInt();
		long b=(long)Math.pow(2, 7);
		long sh=(long)Math.pow(2, 15);
		long i=(long)Math.pow(2, 31);
		//long l=(long)Math.pow(2, 63);
		
		for(int j=0;j<q;j++) {
			try{
				
				long num=s.nextLong();
				System.out.println(num+" can be fitted in:");
				if(num<=b && num>-b) {
					System.out.println("* byte");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				}
				else if(num<=sh && num>-sh) {
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				}
				else if(num<=i && num>-i) {
					System.out.println("* int");
					System.out.println("* long");
				}
				else{
					System.out.println("* long");
				}
				
			}
			catch(InputMismatchException e){
				System.out.println(s.nextLine()+" can't be fitted anywhere.");
			}
		}
		s.close();	
		
	}
}
