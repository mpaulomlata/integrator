

package integrator;

import static integrator.Pdf.PREFACE;
import static integrator.Pdf.RESULT;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Integrator {

    
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            new Pdf().parsePdf("RBN42007_PXBRAVV0_4339593.pdf","preface.txt");
        } catch (IOException ex) {
            Logger.getLogger(Integrator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lecilindro teste = new lecilindro();
        
        teste.learquivo();
        //teste.lecabecalho();
    }
    
}
