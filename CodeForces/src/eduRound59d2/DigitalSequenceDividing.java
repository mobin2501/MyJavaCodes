package eduRound59d2;
import java.util.*;

public class DigitalSequenceDividing {
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		String qstr=s.nextLine();
		int q=Integer.parseInt(qstr);
		String nstr=s.nextLine();
		int n=Integer.parseInt(nstr);
		String str=s.nextLine();
		int[] sn=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			sn[i]=Character.getNumericValue(str.charAt(i));
			//System.out.println(sn[i]);
		}
		ArrayList<Integer> snn=new ArrayList<Integer>();
		int size=1;
		int i=0;
		while(i+size<sn.length) {
			
			if(sn[i]>sn[i+1]) {
				sn[i]=Integer.parseInt(str.substring(i, i+size));
				size++;
				
			}
			i=i+size-1;
		}
		//System.out.println(size);
		for(int j=0;j+size<=sn.length;j++) {
			System.out.println(sn[j]);
		}
		
	}
}
