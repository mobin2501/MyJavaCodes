package pdfviewer;
import java.io.*;
import org.apache.pdfbox.pdmodel.*;

public class removepage {
	public static void main(String args[])throws IOException {
		File file =new File("F:\\Syn machines ECE-.pdf");
		PDDocument d=PDDocument.load(file);
		PDPage p=d.getPage(0);
		System.out.println(d.getDocumentInformation());
		d.save("H:\\PDFboxSmpl\\smpl5.pptx");
		System.out.println("Page 2 removed .");
		d.close();
	}

}
