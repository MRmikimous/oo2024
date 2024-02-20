public class App {
    public static void main(String[] args) {
        Picture picture = new Picture(2, 2, "picture");

        picture.render();

        picture.resize(3, 3);

        System.err.println("Picture: " + picture.getName());
        System.out.println(picture.toString());
    }
}
