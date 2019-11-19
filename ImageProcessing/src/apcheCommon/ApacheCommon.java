package apcheCommon;
import java.util.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;



public class ApacheCommon {
	
	public static void main(String args[]) throws IOException {
		int w=1000;
		int h=1000;
		BufferedImage i=null;
		try {
			//File f=new File("W:\\Java Image Processing\\image2.jpg");
			Scanner s=new Scanner(System.in);
			File f=new File(s.nextLine());
		    i=new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
		    i=ImageIO.read(f);
		    System.out.println("Yes , I found the image !");
		}
		catch(IIOException e){
			System.out.println(e);
		}
	    try {
	    	File o=new File("W:\\Java Image Processing\\image4.jpg");
		    ImageIO.write(i, "png", o);
		    System.out.println("Output Compete !!");
	    }
	    catch(IIOException e){
			System.out.println(e);
		}
	    
	    
	}
	

}
