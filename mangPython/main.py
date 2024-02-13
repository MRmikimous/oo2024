from Board import Board
from Creature import Creature


def main():
    gameBoard = Board([[0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0]])

    creatures = [Creature("Player 1", 'x', [2, 3]), Creature("Player 2", 'x', [3, 2])]

    print(gameBoard.stringify(creatures))

    exit = False
    while exit == False:
        move = input()

        if move == "w":
            creatures[0].moveUp()
        elif move == "s":
            creatures[0].moveDown()
        elif move == "a":
            creatures[0].moveLeft()
        elif move == "d":
            creatures[0].moveRight()
        elif move == "q":
            exit = True
        else:
            print("Invalid move")

        print(gameBoard.stringify(creatures))

main()