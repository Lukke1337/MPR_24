package org.example;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws IOException {

        // Program, który pobierze pdf i umieści na stronie obrazek pobrany adresów URL:


        File pdf = new File("PDFzHTML.pdf");
        File kapibara = new File("kapibara.jpg");


        FileUtils.copyURLToFile(
                new URL("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"),
                pdf);


        FileUtils.copyURLToFile(
                new URL("https://www.thealexandriazoo.com/images/animals/Capybara02.jpg"),
                kapibara);

        PDDocument document = Loader.loadPDF(pdf);
        PDImageXObject pdImage = PDImageXObject.createFromFileByContent(kapibara, document);
        try (PDPageContentStream contentStream = new PDPageContentStream(document, document.getPage(0))) {
            contentStream.drawImage(pdImage, 205, 500);
        }

        document.save(pdf);
        document.close();

    }
}
