package eularProject;

import java.util.*;
public class CountingSundays {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		int count=0;
		for(int i=1;i<=100;i++) {
			for(int j=0;j<=11;j++) {
				Date date=new Date(i,j,1);
				Calendar c=Calendar.getInstance();
				c.setTime(date);
				System.out.println(date+" "+c.get(Calendar.DAY_OF_WEEK));
				if(c.get(Calendar.DAY_OF_WEEK)==1){
					count++;
				}
			}
			
		}
		System.out.println(count);
		
	}
	
}
