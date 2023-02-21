package main;

public class Auto {
	
	String marca;
	String modelo;

	int precio;
	int registro;
	static int cantidadCreados;
	
	Asiento asientos[];
	Motor motor;
	
	public Auto(String marca, String modelo, int precio, int registro, Asiento[] asientos,
			Motor motor) {

		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.asientos = asientos;
		this.motor = motor;
	}
	
	public int cantidadAsientos() {
		
		int cantidad = 0;
		
		for(int i = 0; i<asientos.length; i++) {
			
			if(asientos[i] != null) {
				cantidad++;
			}
		}
		
		return cantidad;					
	}
	
	public String verificarIntegridad() {
		
		for(int i = 0;i<asientos.length;i++) {
			
			if(asientos[i]!= null && asientos[i].registro != this.registro) {
				
				return "Las piezas no son originales";		
			}
			
		}
		
		if(this.registro != this.motor.registro) {
			return "Las piezas no son originales";
		}
		
		return "Auto original";
		
	}
}
