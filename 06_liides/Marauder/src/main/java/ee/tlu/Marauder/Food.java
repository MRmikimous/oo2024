package ee.tlu.Marauder;

public class Food {
    private String name;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]", name, price);
    }

    public void replace(Food food) {
        this.name = food.getName();
        this.price = food.getPrice();
    }
}
