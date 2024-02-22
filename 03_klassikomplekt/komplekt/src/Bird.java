public class Bird extends Animal {
    public String beakColor;
    public String wingColor;
    public String featherColor;

    public Bird(boolean alive, String name, String color, String gender,
            int age, String beakColor, String wingColor, String featherColor) {
        super(alive, name, color, gender, age);
        this.beakColor = beakColor;
        this.wingColor = wingColor;
        this.featherColor = featherColor;
    }
}
