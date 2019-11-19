import java.util.*;
public class problem2 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int u=s.nextInt();
		s.close();
		int[] v=new int[u+1];
		for(int i=0;i<v.length;i++) {
			v[i]=i;
		}
		for(int i=0;i<v.length;i++) {
			if(i>9) {
				System.out.print(" "+v[i]);
			}
			else {
				System.out.print("  "+v[i]);
			}	
		}
		int[] a= {2,4,5,7,8,11};
		ArrayList<Integer> t=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			System.out.print("\n");
			System.out.println(a[i]);
			for(int j=0;j<v.length;j++) {
				if(v[j]%a[i]<1) {
					System.out.print("  "+"T");
				}
				else {
					System.out.print("  "+"F");
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print("\n");
			for(int j=0;j<v.length;j++) {
				if(v[j]%a[i]<1) {
					t.add(v[i]);
					break;
				}
				continue;
			}
		}
		System.out.println(t);
		
		
	}
}
