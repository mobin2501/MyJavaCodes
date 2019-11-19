package eularProject;
import java.util.*;
public class LargestProductInAgrid {
	public static void main(String srgs[]) {
		Scanner s=new Scanner(System.in);
		int[][] grid=new int[20][20];
		for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {
				grid[i][j]=s.nextInt();
			}
		}
		int largest=0;
		for(int i=0;i<17;i++) {
			for(int j=0;j<17;j++) {
				if(largest<grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3]) {
					largest=grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3];
					System.out.println(i+" "+j);
				}
				
			}
		}
		for(int i=0;i<20;i++) {
			for(int j=0;j<17;j++) {
				if(largest<grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3]) {
					largest=grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
					System.out.println(i+" "+j);
				}
				
			}
		}
		for(int i=0;i<17;i++) {
			for(int j=0;j<20;j++) {
				if(largest<grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j]) {
					largest=grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j];
					System.out.println(i+" "+j);
				}
				
			}
		}
		for(int i=0;i<17;i++) {
			for(int j=3;j<20;j++) {
				if(largest<grid[i][j]*grid[i+1][j-1]*grid[i+2][j-2]*grid[i+3][j-3]) {
					largest=grid[i][j]*grid[i+1][j-1]*grid[i+2][j-2]*grid[i+3][j-3];
					System.out.println(i+" "+j);
				}
				
			}
		}
		System.out.println(largest);
		s.close();
	}

}
