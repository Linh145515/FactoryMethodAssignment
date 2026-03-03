  package factorymethod;
  public class PrintSpooler {

    // biến static lưu instance duy nhất
    private static PrintSpooler instance;

    // constructor private (không cho new từ bên ngoài)
    private PrintSpooler() {
        init();
    }

    // hàm init (giả lập khởi tạo phức tạp)
    private void init() {
        System.out.println("PrintSpooler initialized...");
    }

    // phương thức public để lấy instance duy nhất
    public static PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    // ví dụ method in tài liệu
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}