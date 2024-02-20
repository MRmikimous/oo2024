from textual import events
from textual.app import App, ComposeResult
from Board import Board
from textual.widgets import Static

from Creature import Creature
from Direction import Direction

board = [
    [3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4],
    [2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2],
    [2, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2],
    [2, 0, 0, 1, 1, 8, 1, 1, 8, 4, 0, 3, 1, 1, 0, 0, 0, 0, 2],
    [2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 2],
    [2, 0, 2, 0, 0, 0, 0, 1, 1, 7, 0, 2, 0, 0, 0, 0, 0, 0, 2],
    [9, 1, 7, 0, 2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2],
    [2, 0, 2, 0, 0, 0, 0, 0, 1, 11, 1, 10, 1, 0, 0, 0, 0, 0, 2],
    [2, 0, 9, 1, 0, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 2],
    [2, 0, 2, 0, 0, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 2],
    [2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2],
    [5, 1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6],
]

gameBoard = Board(board)

creatures = [Creature("Player 1", "x", [2, 3]), Creature("Player 2", "o", [3, 2])]


def move(creature: Creature, board: Board, move=None):
    if move is None:
        move = creature.direction

    creature.direction = move

    if move == Direction.UP:
        creature.moveUp()
    elif move == Direction.DOWN:
        creature.moveDown()
    elif move == Direction.LEFT:
        creature.moveLeft()
    elif move == Direction.RIGHT:
        creature.moveRight()


class InputApp(App):
    """App to display key events."""

    def compose(self) -> ComposeResult:
        yield Static(gameBoard.render(creatures))

    def on_key(self, event: events.Key) -> None:
        if event.key == "q":
            app.exit()
        elif event.key == "w":
            move(creatures[0], gameBoard, Direction.UP)
        elif event.key == "s":
            move(creatures[0], gameBoard, Direction.DOWN)
        elif event.key == "a":
            move(creatures[0], gameBoard, Direction.LEFT)
        elif event.key == "d":
            move(creatures[0], gameBoard, Direction.RIGHT)
        else:
            move(creatures[0], gameBoard)

        self.query_one(Static).refresh()


if __name__ == "__main__":

    app = InputApp()
    app.run()
