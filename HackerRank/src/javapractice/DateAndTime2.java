package javapractice;
import java.time.LocalDate;
import java.util.*;

public class DateAndTime2 {
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		int m=s.nextInt();
		int d=s.nextInt();
		
		
		s.close();
		
		LocalDate ld=LocalDate.of(y, m, d);
		System.out.println(ld.getDayOfWeek());
		
		

	}

}
