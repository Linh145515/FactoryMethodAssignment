package factorymethod;

public class GumStore extends CandyStore {

    @Override
    protected Candy createCandy() {
        return new Gum();
    }
}