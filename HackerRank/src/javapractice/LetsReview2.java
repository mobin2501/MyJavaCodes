package javapractice;
import java.util.*;
public class LetsReview2 {
	private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        int t;
        int l;
        t = scan.nextInt();
        scan.nextLine();
        
        String str;
        
        while(t>0) {
            
            str = scan.nextLine();
            l = str.length();
            char[] myCharArray = str.toCharArray();
            for(int i=0; i<l; i= i+2) {
                System.out.print(myCharArray[i]);
            }
            System.out.print(" ");
            for(int i=1; i<l; i= i+2) {
                System.out.print(myCharArray[i]);   
            }
            t--;
            if(t >0) {
                System.out.println();
            }
        }


    }

}
