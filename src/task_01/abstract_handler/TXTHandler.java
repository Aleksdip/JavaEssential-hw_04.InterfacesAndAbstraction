package task_01.abstract_handler;

public class TXTHandler extends Handler{
    @Override
    void open() {
        System.out.println("The document opened in TXT format");
    }

    @Override
    void create() {
        System.out.println("The document created in TXT format");
    }

    @Override
    void change() {
        System.out.println("The document changed in TXT format");
    }

    @Override
    void save() {
        System.out.println("The document saved in TXT format");
    }
}
