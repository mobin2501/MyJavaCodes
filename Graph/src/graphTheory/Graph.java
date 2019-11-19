package graphTheory;
import java.util.*;
//Kinda useless if you ask me.
public class Graph {
	public static String eput(String s,String t) {
		return "{"+s+","+t+"}";
	}
	
	public static void main(String args[]) {
		ArrayList<String> v=new ArrayList<String>();
		ArrayList<String> s=new ArrayList<String>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		v.add("v1");
		v.add("v2");
		v.add("v3");
		v.add("v4");
		v.add("v5");
		System.out.println(v);
		s.add(eput(v.get(0), v.get(1)));
		s.add(eput(v.get(0), v.get(2)));
		s.add(eput(v.get(0), v.get(3)));
		s.add(eput(v.get(1), v.get(3)));
		s.add(eput(v.get(1), v.get(4)));
		s.add(eput(v.get(2), v.get(3)));
		s.add(eput(v.get(2), v.get(4)));
		System.out.println(s);
		
		for(int j=0;j<v.size();j++) {
			int c=0;
			for(int i=0;i<s.size();i++) {
				if(s.get(i).substring(1, 3).equals(v.get(j))){
					c++;
					
				}
				if(s.get(i).substring(4,6).equals(v.get(j))) {
					c++;
					
					
				}
			}
			al.add(c);
		}
		System.out.println(al);
		
	}
		

}
