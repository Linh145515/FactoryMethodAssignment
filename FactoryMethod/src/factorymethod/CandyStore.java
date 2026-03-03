package factorymethod;

public abstract class CandyStore {

    public Candy orderCandy() {

        Candy candy = createCandy();   // gọi factory method
        candy.prepare();
        return candy;
    }

    protected abstract Candy createCandy();  // FACTORY  METHOD
}