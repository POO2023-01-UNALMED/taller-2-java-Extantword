package main;

public class Motor {
	
	int numeroCilindros;
	String tipo;
	int registro;
	
	public Motor(int numeroCilindros, String tipo, int registro) {
		super();
		this.numeroCilindros = numeroCilindros;
		this.tipo = tipo;
		this.registro = registro;
	}
	
	public void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	public void asignarTipo(String tipo) {
		
		if(tipo.equalsIgnoreCase("electrico") ||
		   tipo.equalsIgnoreCase("gasolina")) {
			this.tipo = tipo;
		}
	}
}
