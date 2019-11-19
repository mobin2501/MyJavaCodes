package justWondering;

import java.util.Scanner;


public class wonderingString {

	public static void main(String args[]) {
		
		Scanner s =new Scanner(System.in);
   	   
	    System.out.println("=>Enter you binary string : ");
	    String bin = s.next();
	    int last=bin.length()-1;
	    if(bin.charAt(last)=='0')
	    	System.out.println("It is a binary string .");
	    else 
	    	System.out.println("Its not a binary string .");
	    s.close();
	    
	    
	}
}
