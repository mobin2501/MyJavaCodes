package eularProject;

public class SumSquareDifference {
	public static void main(String args[]) {
		int sqosum=0;
		int sumosq=0;
		for(int i=1;i<=100;i++) {
			sqosum=sqosum+i;
		}
		for(int i=0;i<=100;i++) {
			sumosq=sumosq+(int)Math.pow(i, 2);
		}
		System.out.println((int)Math.pow(sqosum,2)-sumosq);
	}

}
