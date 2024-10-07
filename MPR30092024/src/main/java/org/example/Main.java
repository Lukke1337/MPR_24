package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PDDocument document = new PDDocument(); // Stworzenie nowego dokumentu PDF

        PDPage page = new PDPage(); // Stworzenie strony PDF, ale nie dodanie jej jeszcze do pliku
        PDPage page2 = new PDPage(); //Stworzenie strony2 PDF, ale nie dodanie jej jeszcze do pliku
        // ===== \/ ZADANIE \/ =====
        PDPage page3 = new PDPage();
        PDPage page4 = new PDPage();
        PDPage page5 = new PDPage();
        PDPage page6 = new PDPage();
        PDPage page7 = new PDPage();
        PDPage page8 = new PDPage();
        PDPage page9 = new PDPage();
        PDPage page10 = new PDPage();
        // =====

        // 3. Napisz program, który: Na pierwszej z nich umieści Hello World! :
        PDPageContentStream stream = new PDPageContentStream(document,page); //Dodanie contentu stream aby dodać tekst na stronie 1 w dokumencie 1
        stream.beginText(); //Otwarcie tekstu
        stream.setFont(new PDType1Font(Standard14Fonts.FontName.TIMES_ROMAN),14); //Ustawienie tekstu
        stream.newLineAtOffset(25,500); // ustawiam kursor
        stream.showText("Hello World!"); //Dodanie tekstu
        stream.endText(); //Koniec tekstu
        stream.close(); //Koniec streama tekstu w pliku

        // ... Na ostatniej z nich umieści Goodbye World! :
        PDPageContentStream stream10 = new PDPageContentStream(document,page10);
        stream10.beginText();
        stream10.setFont(new PDType1Font(Standard14Fonts.FontName.TIMES_ROMAN),14);
        stream10.newLineAtOffset(25,500);
        stream10.showText("Goodbye World!");
        stream10.endText();
        stream10.close();

        document.addPage(page); //Dodanie strony do PDFa
        document.addPage(page2); //Dodanie drugiej strony do PDFa
        // ===== \/ ZADANIE \/ =====
        document.addPage(page3);
        document.addPage(page4);
        document.addPage(page5);
        document.addPage(page6);
        document.addPage(page7);
        document.addPage(page8);
        document.addPage(page9);
        document.addPage(page10);
        // =====



        document.save("kapibara.pdf"); // Zapisanie PDF

        }
    }