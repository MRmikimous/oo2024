class Creature:
    _symbol: str
    _location: list[int]
    _name: str

    def __init__(self,  name: str, symbol: str, location: list[int]):
        self._symbol = symbol
        self._location = location
        self._name = name
    
    @property
    def symbol(self) -> str:
        return self._symbol
    
    @symbol.setter
    def symbol(self, symbol: str):
        self._symbol = symbol
    
    @property
    def location(self):
        return self._location
    
    @location.setter
    def location(self, location: list[int]):
        self._location = location

    @property
    def name(self) -> str:
        return self._name
    
    @name.setter
    def name(self, name: str):
        self._name = name
    
    def moveUp(self):
        self._location[1] -= 1

    def moveDown(self):
        self._location[1] += 1
    
    def moveLeft(self):
        self._location[0] -= 1
    
    def moveRight(self):
        self._location[0] += 1
    