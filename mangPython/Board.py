from Creature import Creature
from Direction import Direction
from textual.widget import Widget
from textual.app import RenderResult, ComposeResult


class Board(Widget):
    """Display a board."""

    _board: list[list[int]]

    def __init__(self, board: list[list]):
        super().__init__()
        self._board = board

    @property
    def board(self) -> list[list]:
        return self._board

    @board.setter
    def board(self, board: list[list]):
        self._board = board

    def render(self, creatures: list[Creature]) -> RenderResult:
        sb = ""
        for y, i in enumerate(self._board):
            for x, _ in enumerate(i):
                symbol = " "

                if self._board[y][x] == 1:
                    symbol = "─"
                elif self._board[y][x] == 2:
                    symbol = "│"
                elif self._board[y][x] == 3:
                    symbol = "┌"
                elif self._board[y][x] == 4:
                    symbol = "┐"
                elif self._board[y][x] == 5:
                    symbol = "└"
                elif self._board[y][x] == 6:
                    symbol = "┘"
                elif self._board[y][x] == 7:
                    symbol = "┤"
                elif self._board[y][x] == 8:
                    symbol = "┴"
                elif self._board[y][x] == 9:
                    symbol = "├"
                elif self._board[y][x] == 10:
                    symbol = "┬"
                elif self._board[y][x] == 11:
                    symbol = "┼"

                for creature in creatures:
                    if y == creature.location[0] and x == creature.location[1]:
                        symbol = creature.symbol

                sb += symbol
            sb += "\n"
        return sb
