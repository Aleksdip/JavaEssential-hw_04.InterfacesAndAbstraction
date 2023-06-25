package task_01.abstract_handler;

public class XMLHandler extends Handler {
    @Override
    void open() {
        System.out.println("The document opened in XML format");
    }

    @Override
    void create() {
        System.out.println("The document created in XML format");
    }

    @Override
    void change() {
        System.out.println("The document changed in XML format");
    }

    @Override
    void save() {
        System.out.println("The document saved in XML format");
    }
}
