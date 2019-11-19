package eularProject;

public class AmicableNumber {
	public static void main(String args[]) {
		int sum=0;
		int[] nums=new int[10000];
		for(int i=1;i<10000;i++) {
			
			nums[i-1]=d(i);
		}
		for(int i=1;i<10000;i++) {
			for(int j=1;j<10000;j++) {
				if(nums[i-1]==j && nums[j-1]==i && i!=j) {
					System.out.println(i+" "+j);
					sum=sum+i;
				}
			}
		}
		System.out.println(sum);
		
	}
	public static int d(int a) {
		int sum=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
