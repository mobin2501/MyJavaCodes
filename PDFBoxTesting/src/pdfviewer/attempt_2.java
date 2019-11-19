package pdfviewer;

import java.io.IOException;


import org.apache.pdfbox.pdmodel.*;


public class attempt_2 {
	public static void main(String args[]) throws IOException  {
		
		System.out.println("A pdf");
		try {
		PDDocument d=new PDDocument();
		PDPage page=new PDPage();
		d.addPage(page);
		d.addPage(page);
		
		d.save("H:/PDFboxSmpl/smpl3.pdf");
		d.close();
		System.out.println("PDF created");
		}
		catch(IOException  e) {
			System.out.println(e.getMessage());
		}
		
	}

}
