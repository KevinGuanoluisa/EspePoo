class Persona:
    def __init__(self, nombre, edad):
      self.nombre = nombre
      self.edad = edad

    def __str__(self):
       return f"Persona(nombre={self.nombre},edad ={self.edad})"

    def repr(self):
       return f"Persona({self.nombre},{self.edad})"
    
    def __add__ (self,otro):
       nuevo_valor = self.edad + otro.edad
       return Persona(self.nombre+otro.nombre,nuevo_valor)
    
kevin= Persona ("kevin",21)
dalto=Persona ("dalto",14)
lucas=Persona ("lucas",18 )

nueva_persona = (kevin + dalto)

print (nueva_persona.nombre)