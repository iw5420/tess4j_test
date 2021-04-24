

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * @author Ian Wang
 * @date 2021-04-22
 */
public class ReadImages {
    public static void main(String[] args) {

        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath(".\\tessdata\\");

        //language https://tesseract-ocr.github.io/tessdoc/Data-Files
        tesseract.setLanguage("chi_tra");

        String str = null;
        try {
            str = tesseract.doOCR(new File(".\\src\\main\\resources\\test3.png"));
        } catch (TesseractException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(str);
    }

}
