package products;

public class Chocolate extends FoodImpl{

    private static final double CALORIES_PER_100_GRAMS = 575.0;

    public Chocolate ( double grams ) {
        super ( grams, CALORIES_PER_100_GRAMS);
    }
}
