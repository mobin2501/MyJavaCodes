import java.util.*;
public class array {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(6);
		a.add(5);
		System.out.println(a);
		System.out.println(a.size());
		int[] arr=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=i;
		}
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		int temp=arr[0];
		for(int i=0;i<5;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
			}
		}
		System.out.println(temp);
		
	}

}
