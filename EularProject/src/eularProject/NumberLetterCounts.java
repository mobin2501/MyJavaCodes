package eularProject;
import java.util.*;

public class NumberLetterCounts {
	public static void main(String args[]) {
		int sum=0;
		ArrayList<String> str=new ArrayList<String>();
		String zero="";
		String one="One";
		String two="Two";
		String three="Three";
		String four="Four";
		String five="Five";
		String six="Six";
		String seven="Seven";
		String eight="Eight";
		String nine="Nine";
		
		str.add(zero); str.add(one); str.add(two); str.add(three) ; str.add(four) ; str.add(five);
		str.add(six); str.add(seven) ; str.add(eight) ; str.add(nine); str.add("Ten");
		str.add("Eleven"); str.add("Twelve"); str.add("Thirteen"); str.add("Fourteen"); str.add("Fifteen");
		str.add("Sixteen");str.add("Seventeen");str.add("Eighteen");str.add("Nineteen");
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		for(int i=0;i<=19;i++) {
			hm.put(i, str.get(i));
		}
		
		String twenty="Twenty";
		String thirty="Thirty";
		String forty="Forty";
		String fifty="Fifty";
		String sixty="Sixty";
		String seventy="Seventy";
		String eighty="Eighty";
		String ninety="Ninety";
		for(int i=1;i<20;i++) {
			System.out.println(str.get(i));
			sum=sum+str.get(i).length();
		}
		
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		
		hm2.put(2, twenty);hm2.put(3,thirty);hm2.put(4,forty);
		hm2.put(5,fifty);hm2.put(6,sixty);hm2.put(7,seventy);
		hm2.put(8,eighty);hm2.put(9,ninety);
		
		
		int n;
		for(n=20;n<=1000;n++) {
			
			if(n/10<10) {
				int r=n%10;
				int d=n/10;
				System.out.println(hm2.get(d)+hm.get(r));
				String num=hm2.get(d)+hm.get(r);
				sum=sum+num.length();
			}
			else if (n/10>=10 && n/10<100) {
				int r=n%100;
				int d=n/100;
				if(r==0) {
					System.out.println(hm.get(d)+"Hundred");
					String num=hm.get(d)+"Hundred";
					sum=sum+num.length();
				}
				else {
					if(r<20) {
						System.out.println(hm.get(d)+"HundredAnd"+hm.get(r));
						String num=hm.get(d)+"HundredAnd"+hm.get(r);
						sum=sum+num.length();
					}
					else {
						int dd=r/10;
						int rr=n%10;
						System.out.println(hm.get(d)+"HundredAnd"+hm2.get(dd)+hm.get(rr));
						String num=hm.get(d)+"HundredAnd"+hm2.get(dd)+hm.get(rr);
						sum=sum+num.length();
					}
				}
				
			}
			else {
				int d=n/1000;
				System.out.println(hm.get(d)+"Thousand");
				String num=hm.get(d)+"Thousand";
				sum=sum+num.length();
			}
		}
		System.out.println(sum);
		
	}

}
