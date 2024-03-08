public class App {
    public static void main(String[] args) {
        Middle middle = new Middle();

        middle.add(3);
        middle.add(3);
        middle.add(3);
        middle.add(3);
        middle.add(2);
        middle.add(2);

        System.out.println(middle.getBuffer());
        System.out.println(middle.getResult());
    }
}
