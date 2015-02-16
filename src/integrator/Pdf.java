/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package integrator;

/**
 *
 * @author marcosmalta
 */


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
 
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
 
public class Pdf {
 
    /** The original PDF that will be parsed. */
    public static final String PREFACE = "RBN42007_PXBRAVV0_4339593.pdf";
    /** The resulting text file. */
    public static final String RESULT = "preface.txt";
 
    /**
     * Parses a PDF to a plain text file.
     * @param pdf the original PDF
     * @param txt the resulting text
     * @throws IOException
     */
    public void parsePdf(String pdf, String txt) throws IOException {
        PdfReader reader = new PdfReader(pdf);
        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
        PrintWriter out = new PrintWriter(new FileOutputStream(txt));
        TextExtractionStrategy strategy;
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            strategy = parser.processContent(i, new SimpleTextExtractionStrategy());
            out.println(strategy.getResultantText());
        }
        out.flush();
        out.close();
        reader.close();
    }
 
    /**
     * Main method.
     * @param    args    no arguments needed
     * @throws IOException
     
    public static void main(String[] args) throws IOException {
        new Pdf().parsePdf(PREFACE, RESULT);
    }
     */
}