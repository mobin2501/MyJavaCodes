package eularProject;
import java.util.*;
// Fuck, I solved it ... Dynamic Programming - Bottom UP ...
public class MaximumPathSumI {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int[][] arr=new int[15][15];    
		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++) {
				arr[i][j]=0;
			}
		}
		for(int i=0;i<15;i++) {
			for(int j=0;j<=i;j++) {
				arr[i][j]=s.nextInt();
			}
			
		}
		
		for(int j=14;j>0;j--) {
			for(int i=0;i<j;i++) {
				
				if(arr[j][i]+arr[j-1][i]>arr[j-1][i]+arr[j][i+1]) {
					System.out.print(arr[j][i]+arr[j-1][i]+" ");
					arr[j-1][i]=arr[j][i]+arr[j-1][i];
				}
				else {
					System.out.print(arr[j-1][i]+arr[j][i+1]+" ");
					arr[j-1][i]=arr[j-1][i]+arr[j][i+1];
				}
				
			}
			System.out.println();
		}
		s.close();
		
	}

}
