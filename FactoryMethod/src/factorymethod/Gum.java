package factorymethod;

public class Gum extends Candy {

    @Override
    public void prepare() {
        System.out.println("Preparing Gum");
    }
}