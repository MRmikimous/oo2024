public class Animal {
    public boolean alive = true;

    public String name;
    public String color;
    public String gender;
    public int age = 0;

    public Animal(boolean alive, String name, String color, String gender,
            int age) {
        this.alive = alive;
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public void breathe() {
        System.out.println("Breathing");
    }


}
