class Gato:
    def sonido(self):
        return "miauu"
    def imprimirsonidos(self):
        print (self.sonido)

class Perro:
    def sonido(self):
        return "wauw"
    def imprimirsonido(self):
        print (self.sonido)
    
gato = Gato()
perro = Perro()


print (gato.sonido())
print (perro.sonido())
