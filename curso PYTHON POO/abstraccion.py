class Auto():
    def __init__(self):
      self._estado = " apagado"
    
    def encender (self):
       self._estado = "encendiendo "
       print ("El auto esta encendido")

    def conducir (self):
       if self._estado == "apagado":
        self.encender()
        print("conducir auto")
mi_auto = Auto()
mi_auto.conducir()