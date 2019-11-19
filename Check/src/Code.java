
import java.util.*;

public class Code {


    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        Scanner scan = new Scanner(System.in);

        int secondInteger = scan.nextInt();
        double secondDouble = scan.nextDouble();
        scan.nextLine();
        String secondString= scan.nextLine();

        secondDouble = Math.round((d+secondDouble)*10.0)/10.0;

       
        //System.out.println();
        System.out.println(i+secondInteger);

       
        System.out.println(secondDouble);

        System.out.println(s+secondString);

        scan.close();
    }
}