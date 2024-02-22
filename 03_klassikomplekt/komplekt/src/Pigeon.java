public class Pigeon extends FlyingBird {
    public Pigeon(boolean alive, String name, String color, String gender,
            int age, String beakColor, String wingColor, String featherColor) {
        super(alive, name, color, gender, age, beakColor, wingColor,
                featherColor);
    }

    public Pigeon(boolean alive, String color, String gender, int age,
            String beakColor, String wingColor, String featherColor) {
        super(alive, "Pigeon", color, gender, age, beakColor, wingColor,
                featherColor);
    }


}
