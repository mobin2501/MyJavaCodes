package eularProject;
import java.io.*;
import java.util.*;

public class NameScores {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws IOException  {
		
		ArrayList<String> str=new ArrayList<String>();
		ArrayList<String> nstr=new ArrayList<String>();
		File file=new File("H:\\Eular\\p022_names.txt");
		Scanner s=new Scanner(file).useDelimiter("\\W");
		int score=0;
		str.add(s.next());
		while(s.hasNext()) {
			str.add(s.next());
		}
		for( int i=0;i<str.size();i=i+3) {
			nstr.add(str.get(i));
		}
		Collections.sort(nstr);
		for(int i=0;i<nstr.size();i++) {
			int sum=0;
			for(int j=0;j<nstr.get(i).length();j++) {
				sum=sum+((int)nstr.get(i).charAt(j)-64);
			}
			score=score+(i+1)*sum;
			
		}
		System.out.print(score);
		
	}

}
