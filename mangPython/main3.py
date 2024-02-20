from enum import Enum
import curses


def main():
    exit = False
    while exit == False:
        print(gameBoard.stringify(creatures))
        inp = input()

        print(creatures[0])


main()
