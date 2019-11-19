package eularProject;

public class SpecialPythagoreanTriplet {
	public static void main(String args[]) {
		for(int i=1;i<1000;i++) {
			for(int j=1;j<1000;j++) {
				for(int k=1;k<1000;k++) {
					if(i!=j && i!=k && i+j+k==1000 ) {
						if(Math.pow((double)i, 2)+Math.pow((double)j, 2)==Math.pow((double)k, 2)) {
							System.out.println(i*j*k);
						}
						
					}
				}
			}
			
		}
	}

}
