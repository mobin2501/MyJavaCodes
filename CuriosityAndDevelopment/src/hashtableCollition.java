import java.util.*;

public class hashtableCollition {
	public static int hash(String s) {
		int n=0;
		for(int i=0;i<s.length();i++) {
			n=(int)s.charAt(i)+n;
		}
		return n%11;
	}
	public static void main(String args[]){
		Hashtable<Integer,String> h=new Hashtable<Integer,String>();
		Scanner scan=new Scanner(System.in);
		String slimit=scan.nextLine();
		int limit=Integer.parseInt(slimit);
		for(int i=0;i<limit;i++) {
			String s=scan.nextLine();
			if(h.get(i).isEmpty()) {
				
				h.put(hash(s), s);
				
			}
			else {
				h.put(hash(s)+1, s);
			}
			
		}
		scan.close();
		for(int i=0;i<h.size();i++) {
			System.out.println(i+"="+h.get(i));
		}
	}
}
