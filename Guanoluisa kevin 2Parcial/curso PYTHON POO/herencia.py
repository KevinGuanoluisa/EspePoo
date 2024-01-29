class Persona:
    def __init__(self,nombre,edad,nacionlidad):
        self.nombre = nombre
        self.edad = edad
        self.nacionlidad = nacionlidad
    def hablar (self):
        print("hola estoy habalndo")


 
class Empleado (Persona):
    def __init__(self, nombre, edad, nacionlidad,traajo,salario):
        super().__init__(nombre, edad, nacionlidad)
        self.traajo = traajo
        self.salario = salario
roberto = Empleado("Roberto", 43,"Argentino","ingeniero",1000 )

roberto.hablar()