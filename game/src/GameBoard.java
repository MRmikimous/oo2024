import java.util.List;

public class GameBoard {
    private int[][] _board;

    public GameBoard(int[][] board) {
        this._board = board;
    }

    public int[][] getBoard() {
        return _board;
    }

    public void setBoard(int[][] board) {
        this._board = board;
    }

    public String stringify(List<Creature> creatures, List<Item> items) {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < _board.length; y++) {
            for (int x = 0; x < _board[y].length; x++) {
                char symbol = ' ';

                if (_board[y][x] == 1) {
                    symbol = '─';
                } else if (_board[y][x] == 2) {
                    symbol = '│';
                } else if (_board[y][x] == 3) {
                    symbol = '┌';
                } else if (_board[y][x] == 4) {
                    symbol = '┐';
                } else if (_board[y][x] == 5) {
                    symbol = '└';
                } else if (_board[y][x] == 6) {
                    symbol = '┘';
                } else if (_board[y][x] == 7) {
                    symbol = '┤';
                } else if (_board[y][x] == 8) {
                    symbol = '┴';
                } else if (_board[y][x] == 9) {
                    symbol = '├';
                } else if (_board[y][x] == 10) {
                    symbol = '┬';
                } else if (_board[y][x] == 11) {
                    symbol = '┼';
                }

                for (Creature creature : creatures) {
                    if (x == creature.getLocation().x
                            && y == creature.getLocation().y) {
                        symbol = creature.getSymbol();
                    }
                }

                for (Item item : items) {
                    if (x == item.getLocation().x
                            && y == item.getLocation().y) {
                        symbol = item.getSymbol();
                    }
                }
                sb.append(symbol);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void render(List<Creature> creatures, List<Item> items) {
        System.err.println(stringify(creatures, items));
    }
}
