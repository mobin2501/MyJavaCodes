import java.util.*;
public class findingObjectUsingHashtable {
	public static int hash(String s) {
		int n=0;
		for(int i=0;i<s.length();i++) {
			n=(int)s.charAt(i)+n;
		}
		return n%11;
	}
	public static void main(String args[]) {
		Hashtable<Integer,String> h=new Hashtable<Integer,String>();
		h.put(hash("Mia"), "Mia");
		h.put(hash("Bea"), "Bea");
		h.put(hash("Tim"), "Tim");
		h.put(hash("Leo"), "Leo");
		h.put(hash("Sam"), "Sam");
		h.put(hash("Ted"), "Ted");
		h.put(hash("Max"), "Max");
		h.put(hash("Ada"), "Ada");
		h.put(hash("Lou"), "Lou");
		h.put(hash("Zoe"), "Zoe");
		h.put(hash("Jan"), "Jan");
		for(int i=0;i<h.size();i++) {
			System.out.println(i+"="+h.get(i));
		}
		

		
		
	}

}
