class Animal():
    def comer(self):
        print("el animal esta comiedo")

class Ave(Animal):
    def volar(self):
        print("el animal esta volando")

class Mamifero(Animal):
    def amamantar(self):
        print("el animal esta amamantando")

class Muercielago(Mamifero,Ave):
    pass

Muercielago = Muercielago()

Muercielago.comer()
Muercielago.amamantar()
