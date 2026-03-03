package factorymethod;

public class Main {

    public static void main(String[] args) {

        // ===== Factory Method =====
        CandyStore store1 = new ChocolateStore();
        store1.orderCandy();

        CandyStore store2 = new GumStore();
        store2.orderCandy();

        // ===== Singleton =====
        PrintSpooler spooler1 = PrintSpooler.getInstance();
        PrintSpooler spooler2 = PrintSpooler.getInstance();

        spooler1.print("Document A");

        System.out.println(spooler1 == spooler2); // phải là true
    }
}