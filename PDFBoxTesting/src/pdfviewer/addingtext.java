package pdfviewer;

import java.io.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.*;

public class addingtext {
	public static void main(String args[]) throws IOException{
		File file =new File("H:\\PDFboxSmpl\\smpl4.pdf");
		PDDocument d=PDDocument.load(file);
		PDPage bp=d.getPage(0);
		PDPage cp=d.getPage(1);
		PDPageContentStream cs =new PDPageContentStream(d ,bp);
		PDPageContentStream cs2 =new PDPageContentStream(d ,cp);
		cs.beginText();
		cs.setFont(PDType1Font.TIMES_ROMAN, 12);
		
	    cs.newLineAtOffset(25, 500);
		String txt="Text . a lot of text .";
		cs.showText(txt);
		cs.endText();
		cs.close();
		cs2.beginText();
		cs2.setFont(PDType1Font.TIMES_ROMAN, 12);
	    cs2.newLineAtOffset(25, 500);
		
		cs2.showText(txt);
		cs2.endText();
		cs2.close();
		d.save(new File("H:\\PDFboxSmpl\\smpl4.pdf"));
		System.out.println("Text added .");
		d.close();
		
	}

}
