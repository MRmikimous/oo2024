public class GameBoard {
    private int[][] _board;

    public GameBoard(int[][] board) {
        this._board = board;
    }

    public int[][] board() {
        return _board;
    }

    public void board(int[][] board) {
        this._board = board;
    }

    public String stringify(Creature[] creatures) {
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
                // if (y == 0 || y == _board.length - 1) {
                // symbol = '-';
                // } else if (x == 0 || x == _board[y].length - 1) {
                // symbol = '|';
                // }
                for (Creature creature : creatures) {
                    if (x == creature.location().x
                            && y == creature.location().y) {
                        symbol = creature.symbol();
                    }
                }
                sb.append(symbol);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
