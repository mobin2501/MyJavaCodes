package eularProject;

public class EvenFibonaccinumbers {
	public static void main(String args[]) {
		int sum=1;
		int sumofi=0;
		int sumofsum=0;
		for(int i=1;i<=4000000;i=sum+i) {
			sum=sum+i;
			
			if(i%2==0) {
				sumofi=sumofi+i;
				System.out.print(i+" ");
				
			}
			if(sum %2==0) {
				sumofsum=sumofsum+sum;
				System.out.print(sum+" ");

			}	
		}
		System.out.println();
		System.out.println(sumofi+sumofsum);
	}

}
