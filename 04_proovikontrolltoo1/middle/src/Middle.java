import java.util.ArrayList;
import java.util.List;

public class Middle {
    private int offset = 3;

    private List<Integer> buffer = new ArrayList<Integer>();
    private List<Integer> result = new ArrayList<Integer>();

    public void add(int value) {
        buffer.add(value);

        int size = buffer.size();

        if (size >= offset) {
            result.add(calcMiddle(buffer.get(size - offset),
                    buffer.get(size - offset + 1),
                    buffer.get(size - offset + 2)));
        }
    }

    public List<Integer> getResult() {
        return result;
    }

    public List<Integer> getBuffer() {
        return buffer;
    }


    public void clear() {
        buffer.clear();
        result.clear();
    }

    private static int calcMiddle(int a, int b, int c) {
        return (a + b + c) / 3;
    }

}
