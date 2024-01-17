from abc import ABC, abstractclassmethod

class Persona(ABC):
    @abstractclassmethod
    def __init__(self, nombre, edad,sexo,actividad):
      self.nombre = nombre
      self.edad = edad
      self.sexo = sexo
      self.actividad = actividad

    @abstractclassmethod
    def hacer_actividad (self):
       pass
    def present (self):
       print (self.nombre,self.edad,self.sexo,self.actividad)


class Estudiante (Persona):
       def __init__(self, nombre, edad,sexo,actividad):
           super().__init__(nombre, edad,sexo,actividad)

       def hacer_actividad(self):
           print (f"Estoy estudiando: {self.hacer_actividad} ")

class Trabajador(Persona):
    def __init__(self,nombre, edad,sexo,actividad):
        super().__init__( nombre, edad,sexo,actividad)
        
    def hacer_actividad(self):
        print (f"Estoy trabajanado: {self.hacer_actividad}")

kevin = Estudiante("kevin", 20, "masculino","estudiante")
dalto = Trabajador("dalto",24,"masculino","programador")

kevin.hacer_actividad()
kevin.present()
#dalto.present()


        
           
           