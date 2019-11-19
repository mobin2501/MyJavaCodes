package javaImage;
import java.util.*;

import javax.imageio.ImageIO;

import java.io.*;
import java.awt.image.BufferedImage.*;
import java.awt.image.*;


public class BuffImage {
	public static void main(String args[]) throws IOException {
		File file=new File("D:\\Illustrations\\Bitmap_Image_1.bmp");
		BufferedImage bi=ImageIO.read(file);
		System.out.println(bi.getType());
		System.out.println(bi.getData());
		
	}
	

}
