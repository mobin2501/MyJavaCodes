package pdfviewer;


import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class attempt_1 {
	public static void main(String args[])throws IOException{
		
		PDDocument d=new PDDocument();
		PDPage bp=new PDPage();
		d.addPage(bp);
		d.addPage(bp);
		d.addPage(bp);
		
		d.save("H:\\PDFboxSmpl\\smpl4.pdf");
		System.out.println("PDF loaded"); 
		d.close();
		
	}
}
