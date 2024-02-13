import java.util.Random;

public class App {
    private static Random r = new Random();

    public static void main(String[] args) throws Exception {
        System.out.println(hello("World"));
        System.out.println(hello("Dog"));

        System.out.println(rand(0, 100));
        System.out.println(rand(3, 55));
        System.out.println(rand(-50, 0));

        System.out.println(kaibeMaksHinnast(2.3));
        System.out.println(kaibeMaksHinnast(74.32));
    }

    private static String hello(String name) {
        return "Hello, " + name + "!";
    }

    private static int rand(int min, int max) {
        return r.nextInt(min, max);
    }

    private static double kaibeMaksHinnast(double price) {
        return price * 0.2;
    }
}
