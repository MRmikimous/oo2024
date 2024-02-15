public class Picture {
    private int _width;
    private int _height;

    private String _name;
    private char _symbol = '*';

    public Picture(int width, int height, String name) {
        _width = width;
        _height = height;
        _name = name;
    }

    public int getWidth() {
        return _width;
    }

    public int getHeight() {
        return _width;
    }

    public String getName() {
        return _name;
    }

    public void resize(int width, int height) {
        _width = width;
        _height = height;
    }

    public void render() {
        System.out.println("Picture: " + _name);
        for (int i = 0; i < _height; i++) {
            for (int j = 0; j < _width; j++) {
                System.out.print(_symbol);
            }
            System.out.println();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < _height; i++) {
            for (int j = 0; j < _width; j++) {
                sb.append(_symbol);
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}
