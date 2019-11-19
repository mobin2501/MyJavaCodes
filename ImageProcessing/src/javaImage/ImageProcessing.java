package javaImage;
import java.util.*;

import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

public class ImageProcessing {
	public static void main(String args[]) throws IOException {
		int w=1000;
		int h=1000;
		
		BufferedImage i=new BufferedImage(w,h,BufferedImage.TYPE_4BYTE_ABGR);
		
	    try {
	    	File o=new File("W:\\Java Image Processing\\image5.jpg");
		    ImageIO.write(i, "jpg", o);
		    System.out.println("Output Compete !!");
	    }
	    catch(IIOException e){
			System.out.println(e);
		}
	    
	    
	}

}
