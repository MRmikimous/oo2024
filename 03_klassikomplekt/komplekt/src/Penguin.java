public class Penguin extends NonFlyingBird {

    public Penguin(boolean alive, String name, String color, String gender,
            int age, String beakColor, String wingColor, String featherColor) {
        super(alive, name, color, gender, age, beakColor, wingColor,
                featherColor);
    }

    public Penguin(boolean alive, String color, String gender, int age,
            String beakColor, String wingColor, String featherColor) {
        super(alive, "Penguin", color, gender, age, beakColor, wingColor,
                featherColor);
    }

    public void swim() {
        System.out.println("Swimming");
    }

}
