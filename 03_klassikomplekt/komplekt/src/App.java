public class App {
    public static void main(String[] args) throws Exception {
        Pigeon pigeon = new Pigeon(true, "Pigeon", "white", "male", 2, "black",
                "white", "white");
        pigeon.breathe();
        pigeon.fly();

        System.err.println();

        Penguin penguin = new Penguin(true, "Penguin", "black", "male", 2,
                "black", "black", "black");
        penguin.breathe();
        penguin.swim();
    }
}
