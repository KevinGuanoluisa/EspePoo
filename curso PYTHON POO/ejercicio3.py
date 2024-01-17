class Personaje:
    def __inint__(self, nombre, fuerza, velocidad):
        self.nombre = nombre
        self.fuerza = fuerza
        self.velocidad = velocidad
    def __repr__(self):
        return f"{self.nombre} (Fuerza:){self.fuerza},Velocidad: {self.velocidad}"
    
    def __add__(self,otro_pj):
        nuevo_nombre = self.nombre + "-" + otro_pj.nombre
        nuevo_fuerza = ((self.fuerza + otro_pj.fuerza)/2)**2
        nuevo_velocidad = ((self.velocidad + otro_pj.velocidad)/2)**2
        return Personaje(nuevo_nombre, nuevo_fuerza, nuevo_velocidad)
    
goku = Personaje("Goku", 100 , 100)
vegeta = Personaje("vegeta", 99 , 99)
jiren = Personaje("Jiren", 130 , 140)
gogeta = goku  + vegeta
jireta = gogeta + jiren

print(jiren)
# print(gogeta)
# print(goku)
# print(vegeta)
