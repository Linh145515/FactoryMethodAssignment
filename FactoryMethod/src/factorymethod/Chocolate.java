package factorymethod;

public class Chocolate extends Candy {

    @Override
    public void prepare() {
        System.out.println("Preparing Chocolate");
    }
}
