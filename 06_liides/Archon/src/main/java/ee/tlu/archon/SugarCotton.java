package ee.tlu.archon;

public class SugarCotton {
    private int sugar;
    private double calories;
    private int fluffiness;

    public SugarCotton(int sugar, double calories, int fluffiness) {
        this.sugar = sugar;
        this.calories = calories;
        this.fluffiness = fluffiness;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getFluffiness() {
        return fluffiness;
    }

    public void setFluffiness(int fluffiness) {
        this.fluffiness = fluffiness;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

}
