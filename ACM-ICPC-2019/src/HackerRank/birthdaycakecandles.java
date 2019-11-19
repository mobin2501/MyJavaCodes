package HackerRank;
import java.util.*;

public class birthdaycakecandles {
	public static void main(String args[]) throws Exception {
	    //LinkedList<Integer> arr=new LinkedList<Integer>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		/*for(int i=0;i<n;i++) {
			arr.add(s.nextInt());
		}*/
		int[] ar=new int[n];//arr.toArray(new Integer[arr.size()]);
		
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		Arrays.sort(ar);
		//System.out.println(Arrays.toString(ar));
		int num=0;
		if(ar[n-1]>ar[0]) {
			for(int i=0;i<n;i++) {
				if(ar[n-1]==ar[i]) {
					num++;
				}
			
		}
		}
		else{
			num=n;
		}
		s.close();
		System.out.println(num);
		
	}
	

}
