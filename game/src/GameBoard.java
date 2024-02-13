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

                if (y == 0 || y == _board.length - 1) {
                    symbol = '-';
                } else if (x == 0 || x == _board[y].length - 1) {
                    symbol = '|';
                }
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
