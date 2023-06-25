package task_01.abstract_handler;

public class DOCHandler extends Handler{
    @Override
    void open() {
        System.out.println("The document opened in DOC format");
    }

    @Override
    void create() {
        System.out.println("The document created in DOC format");
    }

    @Override
    void change() {
        System.out.println("The document changed in DOC format");
    }

    @Override
    void save() {
        System.out.println("The document saved in DOC format");
    }
}
