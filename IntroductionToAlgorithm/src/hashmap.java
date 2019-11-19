import java.util.*;
public class hashmap {

	public static final String EXIT_KEYWORD="exit";
	
	public static void main(String args[]) throws InputMismatchException {
		Scanner s=new Scanner(System.in);
	    Hashtable<String,Integer> m=new Hashtable<String,Integer>();
		while(s.hasNext()) {
			
			String name=s.next();
			if(EXIT_KEYWORD.equals(name)) {
				break;
			}
			int key=s.nextInt();
			m.put(name,key);
		}
		
		s.close();
		System.out.println(m);
		
	}
}
