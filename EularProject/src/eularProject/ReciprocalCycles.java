package eularProject;
import java.math.*;

public class ReciprocalCycles {
	public static void main(String args[]) {
		
		/*bd=bd.divide(BigDecimal.valueOf(8));
		System.out.print(bd);*/
		for(int i=1;i<1000;i++) {
			int j=i;
			System.out.print("1/"+j+"= ");
			BigDecimal bd=BigDecimal.ONE;
			try {
				bd=bd.divide(BigDecimal.valueOf(i));
				System.out.print(bd);
				System.out.println();
			}
			
			catch(ArithmeticException e){
				
				System.out.println();
			}
			
		}
	}

}
