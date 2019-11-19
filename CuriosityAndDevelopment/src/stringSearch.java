import java.util.Scanner;

public class stringSearch {
	public static void add(int i1,int i2) {
		int i=i1+i2;
		System.out.println("Ans :"+i);
		
	}
	public static void sub(int i1,int i2) {
		int i=i1-i2;
		System.out.println("Ans :"+i);
	}
	public static void multi(int i1, int i2) {
		int i=i1*i2;
		System.out.println("Ans :"+i);
	}

	public static void main(String args []) {
		Scanner s= new Scanner(System.in);
		System.out.println("What arithmatic operation you want to use ?");
		String name =s.next();
		
		if(name.equals("+")) {
			System.out.println("Enter the integers you want to add :");			
			int i1=s.nextInt();			
			int i2=s.nextInt();			
			add(i1,i2);
			
		}
		if(name.equals("-")) {
			System.out.println("Enter the integers you want to subtract :");
			int i1=s.nextInt();			
			int i2=s.nextInt();	
			sub(i1,i2);
			
		}
		if(name.equals("*")) {
			System.out.println("Enter the integers you want to multiply :");
			int i1=s.nextInt();			
			int i2=s.nextInt();	
			multi(i1,i2);
			
		}
		s.close();
	}

}
