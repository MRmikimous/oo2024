public class FlyingBird extends Bird {
    public FlyingBird(boolean alive, String name, String color, String gender,
            int age, String beakColor, String wingColor, String featherColor) {
        super(alive, name, color, gender, age, beakColor, wingColor,
                featherColor);
    }

    public void fly() {
        System.out.println("Flying");
    }
}
