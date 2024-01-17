class Persona:
    def __init__(self,nombre,edad,nacionlidad):
        self.nombre = nombre
        self.edad = edad
        self.nacionlidad = nacionlidad
    def habalr (self):
        print("estoy hablando")


class Artista:
    def __init__(self, habilidad):
        self.habilidad =  habilidad
   
    def habilidad(self):
            print(f"Mi habilidad es: {self.habilidad}")

class EmpleadoArtista (Persona,Artista):
    def __init__(self, nombre, edad, nacionlidad,habilidad,salario,empresa):
        Persona.__init__(self,nombre, edad, nacionlidad)
        Artista.__init__(self,habilidad)
        self.empresa = empresa
        self.salario = salario
        
    
    def presentarse (self):
        print(f'hola soy: {self.nombre}, {self.habilidad()} y trabajo en {self.empresa}')

roberto = EmpleadoArtista(" ROBERTO",43,"Argentino","Cantar","google",10000)
roberto.presentarse()