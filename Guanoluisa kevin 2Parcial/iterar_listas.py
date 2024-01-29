import time

def busqueda_binaria_con_posicion(lista, objetivo):
    inicio = time.time()
    izquierda, derecha = 0, len(lista) - 1

    while izquierda <= derecha:
        medio = (izquierda + derecha) // 2
        valor_medio = lista[medio]

        if valor_medio == objetivo:
            fin = time.time()
            tiempo = fin - inicio
            return True, medio, tiempo
        elif valor_medio < objetivo:
            izquierda = medio + 1
        else:
            derecha = medio - 1

    fin = time.time()
    tiempo = fin - inicio
    return False, -1, tiempo

def busqueda_lineal_con_posicion(lista, objetivo):
    inicio = time.time()
    for i, elemento in enumerate(lista):
        if elemento == objetivo:
            fin = time.time()
            tiempo = fin - inicio
            return True, i, tiempo
    fin = time.time()
    tiempo = fin - inicio
    return False, -1, tiempo

# Crear una lista de números del 1 al 1000000
mi_lista = list(range(1, 1000001))

# Número a buscar en la lista
elemento_a_buscar = int(input("Ingrese el elemento a buscar: "))
# Búsqueda binaria
resultado_binaria, posicion_binaria, tiempo_binaria = busqueda_binaria_con_posicion(mi_lista, elemento_a_buscar)

# Búsqueda lineal
resultado_lineal, posicion_lineal, tiempo_lineal = busqueda_lineal_con_posicion(mi_lista, elemento_a_buscar)

if resultado_binaria:
    print(f"Búsqueda binaria: El número {elemento_a_buscar} se encuentra en la posición {posicion_binaria}.")
    print(f"Tiempo de ejecución: {tiempo_binaria} segundos.")
else:
    print(f"Búsqueda binaria: El número {elemento_a_buscar} no se encuentra en la lista.")
    print(f"Tiempo de ejecución: {tiempo_binaria} segundos.")

if resultado_lineal:
    print(f"Búsqueda lineal: El número {elemento_a_buscar} se encuentra en la posición {posicion_lineal}.")
    print(f"Tiempo de ejecución: {tiempo_lineal} segundos.")
else:
    print(f"Búsqueda lineal: El número {elemento_a_buscar} no se encuentra en la lista.")
    print(f"Tiempo de ejecución: {tiempo_lineal} segundos.")    