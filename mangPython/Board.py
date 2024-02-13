from Creature import Creature


class Board:
    _board: list[list[int]]

    def __init__(self, board: list[list]):
        self._board = board
    
    @property
    def board(self) -> list[list]:
        return self._board
    
    @board.setter
    def board(self, board: list[list]):
        self._board = board
    
    def stringify(self, creatures: list[Creature]):
        sb = ""
        for y, i in enumerate(self._board):
            for x, _ in enumerate(i):
                symbol = ' '

                if y == 0 or y == len(self._board) - 1:
                    symbol = '-'

                elif x == 0 or x == len(i) - 1:
                    symbol = '|'
                
                for creature in creatures:
                    if x == creature.location[0] and y == creature.location[1]:
                        symbol = creature.symbol

                sb += symbol
            sb += '\n'
        return sb
        