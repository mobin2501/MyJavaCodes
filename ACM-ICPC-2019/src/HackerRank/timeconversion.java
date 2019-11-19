package HackerRank;
import java.util.*;
public class timeconversion {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		s.close();
		
		String hh=str.substring(0, 2);
		int hh1=Integer.parseInt(hh);
		String t=str.substring(8,10); 
		String mm=str.substring(3,5);
		String ss=str.substring(6,8);
		if(t.equals("AM")){
			if(hh1==12) {
				String hh24="00";
				
				System.out.println(hh24+":"+mm+":"+ss);
			}
			else {
				System.out.println(hh+":"+mm+":"+ss);
			}
			
		}
		else if(t.equals("PM")) {
			if(hh1==12) {
				String hh24=String.valueOf(hh);
				System.out.println(hh24+":"+mm+":"+ss);
			}
			else {
				System.out.println(hh1+12+":"+mm+":"+ss);
			}
			
			
		}
	}

}
