class Asiento:

    def __init__(self, color, precio, registro):

        self.color = color
        self.precio = precio
        self.registro = registro

    def cambiarColor(self, color):

        color = color.upper()

        if(color == 'AMARILLO' or
           color == 'VERDE' or  
           color == 'NEGRO' or
           color == 'ROJO' or 
           color == 'BLANCO'):

           self.color = color

class Auto:

    cantidadCreados = 0

    def __init__(self, modelo, precio, asientos, marca, motor, registro):

        self.modelo = modelo
        self.precio = precio
        self.asientos = asientos
        self.marca = marca
        self.motor = motor
        self.registro = registro

    def cantidadAsientos(self):
        
        cont = 0

        for asiento in self.asientos:

            if type(asiento) == Asiento:

                cont += 1

        return cont

def verificarIntegridad(self):

    for asiento in self.asientos:

        if(asiento.registro != self.registro):
            return "Las piezas no son originales" 

    if(self.motor.registro != self.registro):
        return "Las piezas no son originales" 

    return "Auto original"

class Motor:

    def __init__(self, numeroCilindros, tipo, registro):

        self.numeroCilindros = numeroCilindros
        self.tipo = tipo
        self.registro = registro

    def cambiarRegistro(self, registro):

        self.registro = registro

    def asignarTipo(self, tipo):

        if(tipo.upper() == "ELECTRICO" or
           tipo.upper() == "GASOLINA"):

           self.tipo = tipo





           

