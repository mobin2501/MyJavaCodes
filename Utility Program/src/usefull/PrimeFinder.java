package usefull;
import java.util.*;
public class PrimeFinder {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("If Nothing comes out that means its a prime number .");
		int i=s.nextInt();
		if(i%2!=0) {
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					System.out.println("Not a prime!");
					break;
				}
			}
			
		}
		else {
			System.out.println("Dude that's an even number !!");
		}
		s.close();
	}

}
