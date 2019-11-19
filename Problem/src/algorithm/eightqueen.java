package algorithm;

public class eightqueen {
	public static void print(int[][] a) {
		for(int i=0;i<8 ;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.print("\n");
			
		}
	}
	public static void main(String args[]) {
		int[][] a=new int[8][8];
		int row=0;
		int column=0;
		a[row][column]=1;

		for(int i=1;i<8;i++) {
			a[0][i]=1;
			a[i][0]=1;
			a[i][i]=1;
		}
		print(a);
		
	}

}
