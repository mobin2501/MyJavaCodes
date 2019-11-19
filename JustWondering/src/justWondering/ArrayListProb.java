package justWondering;
import java.util.*;

public class ArrayListProb {
	public static void main(String args[]) {
		ArrayList<Integer> i=new ArrayList<Integer>();
		for(int j=0;j<5;j++) {
			i.add(j);
		}
		System.out.println(i.get(3)*i.get(2));
		
	}

}
