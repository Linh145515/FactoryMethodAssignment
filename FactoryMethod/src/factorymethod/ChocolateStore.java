package factorymethod;

public class ChocolateStore extends CandyStore {

    @Override
    protected Candy createCandy() {
        return new Chocolate();
    }
}