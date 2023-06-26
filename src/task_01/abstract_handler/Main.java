package task_01.abstract_handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

//        create a reader for reading a document
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Available formats: doc, txt, xml. Enter the name of the document, with its extension." +
                "\nFor example: NameDocument.doc");
        String document = reader.readLine();

//        create a document depending on its format
        if (document.contains(".doc")) {
            Handler newDocument = new DOCHandler();
            newDocument.create();
            newDocument.open();
            newDocument.change();
            newDocument.save();
        } else if (document.contains(".xml")) {
            Handler newDocument = new XMLHandler();
            newDocument.create();
            newDocument.open();
            newDocument.change();
            newDocument.save();
        } else if (document.contains(".txt")) {
            Handler newDocument = new TXTHandler();
            newDocument.create();
            newDocument.open();
            newDocument.change();
            newDocument.save();
        } else System.out.println("Invalid format.");

    }
}
