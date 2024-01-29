class Celular:
 #metodo especial
    def __init__(self, marca, modelo, camara) :
        self.marca = marca
        self.modelo= modelo 
        self.camara = camara
 #metodos
    def llamar(self) :
        print(f'estad haciendo un llamda desde un:{self.modelo}')
    
    def cortar(self) :
        print(f'cortaste de llamada desde tu: {self.modelo}')

celular1 = Celular("samsung", "S23", "48MP")
celular2 = Celular("Apple","IPhone 15 Pro","98MP")

celular1.llamar()