package javapractice;
import java.util.*;
import java.text.*;

public class Dateandtime {	
	public static void main(String args[]) throws ParseException {
		Scanner s=new Scanner(System.in);
		//Calendar c=Calendar.getInstance();
		String d=s.nextLine();
		SimpleDateFormat date=new SimpleDateFormat("MM/dd/yyyy");
		
		Date dt=date.parse(d);
		DateFormat df=new SimpleDateFormat("EEEE");
		String day=df.format(dt);
		System.out.println(day.toUpperCase());
		s.close();
	}

}
