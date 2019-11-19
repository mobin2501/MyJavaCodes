package round533d2;
import java.util.*;

public class ZuhairAndStrings {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		String ns=s.next();
		int n=Integer.parseInt(ns);
		String ks=s.next();
		int k=Integer.parseInt(ks);
		String str=s.nextLine();
		ArrayList<String> as=new ArrayList<String>();
		
		boolean bool=false;
		for(int i=1;i<str.length();i=k+i) {
			if(i+k<=str.length()) {
				as.add(str.substring(i, i+k));	
			}
		}
		System.out.println(as);
		for(int i=0;i<as.size();i++) {
			char[] ch=as.get(i).toCharArray();
			
			for(int j=0;j<k;j++) {
				if(ch[0]!=ch[j]) {
					bool=false;break;
				}
				else {
					bool=true;
				}
			}
			continue;
		}
		int count=0;

		if(bool==true) {
			if(!as.isEmpty()) {
				for(int i=0;i<as.size();i++) {
					if(as.get(0).equals(as.get(i))){
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
		else {
			System.out.println(count);
		}
		
		
	}
	

}
